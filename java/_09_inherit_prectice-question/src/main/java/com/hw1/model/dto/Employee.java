package com.hw1.model.dto;

public class Employee extends Person {

    private int salary;
    private String dept;

    public Employee () {
        System.out.println("Employee 클래스 기본 생성자 호출됨");
    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        super.name = name;
        this.salary = salary;
        this.dept = dept;

        System.out.println("Employee 클래스의 부모 필드도 초기화하는 생성자 호출함");
    }

    public void setSalary(int salary) { this.salary = salary; }
    public void setDept(String dept) { this.dept = dept; }

    public int getSalary() { return salary; }
    public String getDept() { return dept; }

    @Override
    public String information() {
        return super.information()
                + "Employee [salary=" + this.salary
                + ", dept=" + this.dept
                + "]";
    }
}
