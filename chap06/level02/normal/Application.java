package com.hanwhaswcamp.chap06.level02.normal;

public class Application {
    public static void main(String[] args) {
        BookDTO book = new BookDTO();
        book.printInfomation();

        BookDTO book2 = new BookDTO();
        book2.setTitle("자바의  정석");
        book2.setPublisher("도우출판");
        book2.setAuthor("남궁성");
        book2.printInfomation();
        // BookDTO b2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        BookDTO book3 = new BookDTO();
        book3.setTitle("홍길동전");
        book3.setPublisher("활빈당");
        book3.setAuthor("허균");
        book3.setPrice(5000000);
        book3.setDiscountRate(0.5);
        book3.printInfomation();
        // BookDTO b3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
    }
}
