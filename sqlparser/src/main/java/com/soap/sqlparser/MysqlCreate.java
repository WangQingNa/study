package com.soap.sqlparser;


import org.apache.calcite.adapter.jdbc.JdbcSchema;
import org.apache.calcite.config.Lex;
import org.apache.calcite.jdbc.CalciteConnection;
import org.apache.calcite.jdbc.CalciteFactory;
import org.apache.calcite.plan.Contexts;
import org.apache.calcite.plan.hep.HepPlanner;
import org.apache.calcite.plan.hep.HepProgram;
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.RelRoot;
import org.apache.calcite.schema.Schema;
import org.apache.calcite.schema.SchemaPlus;
import org.apache.calcite.sql.SqlDialect;
import org.apache.calcite.sql.SqlDialectFactoryImpl;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.parser.SqlParserImplFactory;
import org.apache.calcite.sql.parser.impl.SqlParserImpl;
import org.apache.calcite.tools.*;
import org.apache.commons.dbcp2.BasicDataSource;


import javax.sql.DataSource;
import java.sql.*;
import java.util.Properties;

/**
 * @author yangfuzhao on 2021/11/9.
 */
public class MysqlCreate {
    public static void main(String[] args) throws Exception {


        SqlParser.configBuilder().setLex(Lex.MYSQL);



        String serverIP = "localhost:3306";
//        serverIP = args[0];
        String sourceDataBaseName = "or_test";
//        sourceDataBaseName = args[1];
        String sourceDatabaseUser = "root";
//        sourceDatabaseUser = args[2];
        String sourceDatabasePassword = "123456";
//        sourceDatabasePassword = args[3];
        String MYSQL_SCHEMA = "or_test";
//        MYSQL_SCHEMA = args[4];
        String queryText = "SELECT * FROM person";  //Запрос всегда должен содержать в поле From указание имени схемы.
//        queryText = args[5];

        Connection connection = DriverManager.getConnection("jdbc:calcite:");
        CalciteConnection calciteConnection = connection.unwrap(CalciteConnection.class);
        SchemaPlus rootSchema = calciteConnection.getRootSchema();

        DataSource mysqlDataSource = JdbcSchema.dataSource(
                "jdbc:mysql://"+ serverIP + "/" + sourceDataBaseName,
                "com.mysql.jdbc.Driver",
                sourceDatabaseUser,
                sourceDatabasePassword
        );

        rootSchema.add(MYSQL_SCHEMA, JdbcSchema.create(rootSchema, MYSQL_SCHEMA, null, null, "or_test"));
        SqlParser.Config parserConfig = SqlParser.configBuilder().setCaseSensitive(false).build();
        FrameworkConfig config = Frameworks.newConfigBuilder()
                .defaultSchema(rootSchema)
                .parserConfig(parserConfig)
                .context(Contexts.of(calciteConnection.config()))
                .build();

        RelNode node = parseAndValidateSQL(config, queryText);
        HepProgram program = HepProgram.builder().build();
        HepPlanner planner = new HepPlanner(program);
        planner.setRoot(node);

        RelNode optimizedNode = planner.findBestExp();
        final RelRunner runner = connection.unwrap(RelRunner.class);
        PreparedStatement ps = runner.prepare(optimizedNode);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()){
            for (int i=1; i <= resultSet.getMetaData().getColumnCount(); i++){
                System.out.print(resultSet.getString(i));
                System.out.print(";");
            }
            //Thread.sleep(1000);
            System.out.println();
        }

    }
    private static RelNode parseAndValidateSQL(FrameworkConfig config, String queryText) throws SqlParseException, ValidationException, RelConversionException {
        // Build our connection
        RelNode outputRelNode;

        Planner planner = Frameworks.getPlanner(config);

        SqlNode node = planner.parse(queryText);
        SqlNode validateNode = planner.validate(node);
        RelRoot root  = planner.rel(validateNode);
        outputRelNode = root.project();
        return outputRelNode ;
    }

}
