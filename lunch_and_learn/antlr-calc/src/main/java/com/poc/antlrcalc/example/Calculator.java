package com.poc.antlrcalc.example;

import com.poc.antlrcalc.gen.ExprLexer;
import com.poc.antlrcalc.gen.ExprParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Calculator {
    public static void main(String[] args) throws Exception {
        String expression = "(1 + 2) * 3";

        // Cria um input para o ANTLR
        CharStream input = CharStreams.fromString(expression);

        // Cria lexer e parser
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);

        // Faz o parse começando pela regra 'expr'
        ParseTree tree = parser.expr();

        // Visita a árvore
        EvalVisitor visitor = new EvalVisitor();
        int result = visitor.visit(tree);

        System.out.println("Result: " + result);
    }
}