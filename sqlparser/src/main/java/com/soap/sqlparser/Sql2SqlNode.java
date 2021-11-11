package com.soap.sqlparser;

import org.apache.calcite.config.Lex;
import org.apache.calcite.jdbc.CalciteConnection;
import org.apache.calcite.plan.Contexts;
import org.apache.calcite.schema.SchemaPlus;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.dialect.Db2SqlDialect;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.util.SqlString;
import org.apache.calcite.tools.FrameworkConfig;
import org.apache.calcite.tools.Frameworks;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author yangfuzhao on 2021/10/28.
 */
public class Sql2SqlNode {
    /**
     * 不支持mysql语法的create
     * @param args
     * @throws SqlParseException
     */
    public static void main(String[] args) throws SqlParseException {
//        SqlParser.Config config = SqlParser.configBuilder()
//                .setLex(Lex.MYSQL_ANSI) //使用mysql 语法
//                .build();
        String sql = "CREATE TABLE `person` (\n" +
                "  `id` int(10) NOT NULL AUTO_INCREMENT,\n" +
                "  `first_name` varchar(120) NOT NULL,\n" +
                "  `last_name` varchar(120) NOT NULL,\n" +
                "  `birth_date` date DEFAULT NULL,\n" +
                "  `deleted` varchar(6) NOT NULL DEFAULT 'false',\n" +
                "  `txn` decimal(10,0) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ";
        SqlParser.Config build = SqlParser.configBuilder().setLex(Lex.MYSQL).build();
        SqlParser sqlParser = SqlParser.create(sql, build);

        SqlNode sqlNode = sqlParser.parseStmt();
        System.out.println(sqlNode);

    }
}
