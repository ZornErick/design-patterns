package com.design_patterns.structural.facade;

public class Compiler {
    private Scanner scanner = new Scanner();
    private Parser parser = new Parser();
    private CodeGenerator codeGenerator = new CodeGenerator();

    public String compile(String source) {
        String tokens = scanner.scan(source);
        String ast = parser.parse(tokens);
        return codeGenerator.generate(ast);
    }
}
