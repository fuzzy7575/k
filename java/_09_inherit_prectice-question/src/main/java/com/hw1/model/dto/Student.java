package com.hw1.model.dto;

public class Student extends Person{

    private int grade;
    private String major;

    public Student() {
        System.out.println("Student 클래스 기본 생성자 호출됨");
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.name = name;
        this.grade = grade;
        this.major = major;

        System.out.println("Student 클래스의 부모 필드도 초기화하는 생성자 호출함");
    }

    public void setGrade(int grade) { this.grade = grade; }
    public void setMajor(String major) { this.major = major; }
    public int getGrade() { return grade; }
    public String getMajor() { return major; }

    @Override
    public String information() {
        return super.information()
            + "Student [grade=" + this.grade
            + ", major=" + this.major
            + "]";
    }
}
