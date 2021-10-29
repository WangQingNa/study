package com.soap.sqlparser;

import org.apache.calcite.config.Lex;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.dialect.Db2SqlDialect;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.util.SqlString;

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
        SqlParser sqlParser = SqlParser.create("create TABLE dim_dts_rt_sc_csu_grid_onshelf_info (\n" +
                "  id BIGINT,\n" +
                        "  csu_code INTEGER,\n" +
                        "  sku_code INTEGER,\n" +
                        "  spu_code VARCHAR,\n" +
                        "  bu_id INTEGER,\n" +
                        "  sales_grid_id BIGINT,\n" +
                        "  on_shelf TINYINT,\n" +
                        "  dealer_id BIGINT,\n" +
                        "  channel_id INTEGER,\n" +
                        "  valid SMALLINT,\n" +
                        "  istatus SMALLINT,\n" +
                        "  create_time TIMESTAMP,\n" +
                        "  create_by VARCHAR,\n" +
                        "  last_modify_time TIMESTAMP,\n" +
                        "  last_modify_by VARCHAR\n" +
                        ")");
        SqlNode sqlNode = sqlParser.parseStmt();

        SqlString sqlString = sqlNode.toSqlString(Db2SqlDialect.DEFAULT);
        System.out.println("xxxx:"+ sqlString);
    }
}
