package chap06;

public class BookVO {

    String title;
    String publisher;
    String author;
    int price;
    double discountRate;

    BookVO() {
        System.out.println("BookVO 클래스의 기본 생성자 호출함");
    }
    BookVO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;

        System.out.println("BookVO 클래스의 title, publisheer, author 필드를 초기화 하는 생성자 호출함");
    }
    BookVO(String title, String publisher, String author, int price, double discountRate) {
        this(title, publisher, author);
        this.price = price;
        this.discountRate = discountRate;

        System.out.println("BookVO 클래스의 모든 필드를 초기화하는 생성자 호출함");
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public String getTitle() {
        return title;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice() {
        return price;
    }
    public double getDiscountRate() {
        return discountRate;
    }

    public String printInformation() {
        return "BookVO [title=" + this.title + ", publisher=" + this.publisher +
                ", auther=" + this.author + ", price=" + this.price + "discountRate=" + this.discountRate + "]";
    }

}
