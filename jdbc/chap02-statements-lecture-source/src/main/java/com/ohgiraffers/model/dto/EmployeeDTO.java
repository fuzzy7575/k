package com.ohgiraffers.model.dto;

import java.sql.Date;

/*
* DTO(Data Transfer Object)
* 여러 계층간 데이터 전송을 위해 다양한 타입의 데이터를 하나로 묶어 전송하는 쓰임의 클래스
* 유사한 말로는 VO, Bean, Entity, (DO, Domain, Row) 등이 있음
*
* DTO 클새스의 조건
* 1. 모든 필드는 private
* 2. 기본생성자와 모든 필드를 초기화 하는 생성자
* 3. 모든 필드에 대한 setter/getter
* 4. toString Overriding을 이용한 필드값 반환용 메소드
* 5. 직렬화 처리
* */

public class EmployeeDTO {

    private String empId;
    private String empName;
    private String empNo;
    private String email;
    private String phone;
    private String deptCode;
    private String jobCode;
    private String salLevel;
    private int sallary;
    private double bonus;
    private String managerId;
    private java.sql.Date hireDate;
    private java.sql.Date entDate;
    private String entYn;

    public EmployeeDTO() {}
    public EmployeeDTO(String empId, String empName, String empNo, String email, String phone, String deptCode, String jobCode, String salLevel, int sallary, double bonus, String managerId, Date hireDate, Date entDate, String entYn) {
        this.empId = empId;
        this.empName = empName;
        this.empNo = empNo;
        this.email = email;
        this.phone = phone;
        this.deptCode = deptCode;
        this.jobCode = jobCode;
        this.salLevel = salLevel;
        this.sallary = sallary;
        this.bonus = bonus;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.entDate = entDate;
        this.entYn = entYn;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setEntDate(Date entDate) {
        this.entDate = entDate;
    }

    public void setEntYn(String entYn) {
        this.entYn = entYn;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public int getSallary() {
        return sallary;
    }

    public double getBonus() {
        return bonus;
    }

    public String getManagerId() {
        return managerId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Date getEntDate() {
        return entDate;
    }

    public String getEntYn() {
        return entYn;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salLevel='" + salLevel + '\'' +
                ", sallary=" + sallary +
                ", bonus=" + bonus +
                ", managerId='" + managerId + '\'' +
                ", hireDate=" + hireDate +
                ", entDate=" + entDate +
                ", entYn='" + entYn + '\'' +
                '}';
    }
}
