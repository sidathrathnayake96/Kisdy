package com.example.kidsy;

public class PreMathsData {

    private String BookName;
    private String AuthorName;
    private String Price;
    private Integer BookImage;

    public PreMathsData(String bookName, String authorName, String price, Integer bookImage) {

        BookName = bookName;
        AuthorName = authorName;
        Price = price;
        BookImage = bookImage;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Integer getBookImage() {
        return BookImage;
    }

    public void setBookImage(Integer bookImage) {
        BookImage = bookImage;
    }
}
