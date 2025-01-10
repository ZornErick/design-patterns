package com.design_patterns.creational.java_builder;

public class GenericBuilderApplication {
    public static void main(String[] args) {
        GenericPost genericPost = GenericBuilder.of(GenericPost::new)
                .with(GenericPost::setTitle, "Java Builder Pattern")
                .with(GenericPost::setText, "Java Builder Pattern Explained")
                .with(GenericPost::setCategory, "Design Patterns")
                .build();

        System.out.println(genericPost.getTitle());
        System.out.println(genericPost.getText());
        System.out.println(genericPost.getCategory());
    }
}
