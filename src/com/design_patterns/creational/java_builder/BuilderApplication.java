package com.design_patterns.creational.java_builder;

public class BuilderApplication {
    public static void main(String[] args) {
        Post post = new Post.Builder()
                .title("Java Builder Pattern")
                .text("Java Builder Pattern Explained")
                .category("Design Patterns")
                .build();

        System.out.println(post.getTitle());
        System.out.println(post.getText());
        System.out.println(post.getCategory());
    }
}
