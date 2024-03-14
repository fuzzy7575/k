package chap06;

public class Application1 {

    public static void main(String[] args) {

        BookVO bvo1 = new BookVO();
        System.out.println(bvo1.printInformation());

        BookVO bvo2 = new BookVO("혼자 공부하는 자바","한빛미디어","신용권");
        System.out.println(bvo2.printInformation());

        BookVO bvo3 = new BookVO("혼자 공부하는 자바","한빛미디어","신용권", 24000, 5.0);
        System.out.println(bvo3.printInformation());

    }
}
