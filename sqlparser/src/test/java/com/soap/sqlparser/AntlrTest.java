package com.soap.sqlparser;

import com.soap.sqlparser.antlr4.TestBaseVisitor;
import com.soap.sqlparser.antlr4.TestLexer;
import com.soap.sqlparser.antlr4.TestParser;
import com.soap.sqlparser.antlr4.TestVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author yangfuzhao on 2021/10/29.
 */
public class AntlrTest {

    public static void main(String[] args) {
        CharStream input = CharStreams.fromString("12*2+12\r\n");
        TestLexer lexer = new TestLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TestParser parser = new TestParser(tokens);
        TestParser.ExprContext expr = parser.expr();// parse
        TestBaseVisitor visitor = new TestBaseVisitor<>();
        visitor.visit(expr);
//        TestVisitor vt = new TestVisitor();
//        vt.visit(tree);

    }
}
