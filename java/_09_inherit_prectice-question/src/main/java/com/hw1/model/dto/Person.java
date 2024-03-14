package com.hw1.model.dto;

public class Person {

    protected String name;
    private int age;
    private double height;
    private double weight;

    public Person() {
        System.out.println("Person 클래스 기본 생성자 호출됨");
    }

    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;

        System.out.println("Person 클래스 age, height, weight 필드를 초기화한 생성자 호출됨");
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    public String information() {
        return "Person [name=" + this.name
                + ", age=" + this.age
                + ", height=" + this.height
                + ", weight=" + this.weight
                + "]";
    }

}
