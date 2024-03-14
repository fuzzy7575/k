package com.hw1.model.dto;

public class Member {

    private String name;
    private int age;
    private char gender;
    private int couponCount;

    public Member() {}

    public Member(String name, int age, char gender, int couponCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public String toString() {
//        return "Member [name=" + this.name
//                + ", age=" + this.age
//                + ", gender=" + this.gender
//                + ", couponCount=" + this.couponCount
//                + "]";
        return "이름 : " + this.name + "\n"
                + "나이 : " + this.age + "\n"
                + "성별 : " + this.gender + "\n"
                + "쿠폰 개수 : " + this.couponCount ;
    }
}
