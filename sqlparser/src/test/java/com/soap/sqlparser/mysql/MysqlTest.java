package com.soap.sqlparser.mysql;

import com.soap.sqlparser.antlr4.mysql.MySqlLexer;
import com.soap.sqlparser.antlr4.mysql.MySqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author yangfuzhao on 2021/10/29.
 */
public class MysqlTest {

    public static void main(String[] args) {
        CharStream input = CharStreams.fromString("12*2+12\r\n");
        MySqlLexer lexer = new MySqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MySqlParser parser = new MySqlParser(tokens);
        //        MySqlBaseVisitor visitor = new MySqlBaseVisitor<>();
//        visitor.visit(expr);
    }
}
