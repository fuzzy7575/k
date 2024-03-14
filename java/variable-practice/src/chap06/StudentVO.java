package chap06;

public class StudentVO {

    int grade;
    int classroom;
    String name;
    double height;
    char gender;

    StudentVO() {
        System.out.println("StudentVO 클래스의 기본 생성자 호출함");
    }
    StudentVO(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;

        System.out.println("StudentVO 클래스의 모든 필드를 초기화 하는 생성자 호출함");
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }
    public int getClassroom() {
        return classroom;
    }
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public char getGender() {
        return gender;
    }

//    public String printInformation() {
////        return "StudentVO [grade=" + this.grade + ", classroom=" + this.classroom +
////                ", name=" + this.name + ", height=" + this.height + "gender=" + this.gender + "]";
//
//        return  "학년 : " + this.grade + "\n" +
//                "반 : " + this.classroom + "\n" +
//                "이름 : " + this.name + "\n" +
//                "키 : " + this.height + "\n" +
//                "성별 : " + this.gender + "\n";
//    }
    public void printInformation() {
        System.out.println("학년 : " + this.grade);
        System.out.println("반 : " + this.classroom);
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("성별 : " + this.gender);
    }

}
