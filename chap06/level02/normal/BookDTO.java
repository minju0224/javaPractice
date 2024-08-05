package com.hanwhaswcamp.chap06.level02.normal;

public class BookDTO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO() {}
    public BookDTO(String title, String publisher, String author) {}
    public BookDTO(String title, String publisher, String author, int price, double discountRate) {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void printInfomation() {
        System.out.println(title + " " + publisher + " " + author + " " + price + " " + discountRate);
    }
}