package com.yao.andrew;

public class Person {
    private int age;
    private String name;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayIntro() {
        System.out.println("Hi, my name is " +  name);
        System.out.println("I am " +  age + " years old");
    }

    public String getName() {
        return name;
    }
}
