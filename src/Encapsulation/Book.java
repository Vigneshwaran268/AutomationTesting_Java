package Encapsulation;

public class Book {

    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;

    public void setter(String title, String author, double price){
        bookTitle = title;
        bookAuthor = author;
        bookPrice = price;
    }

    public String getTitle(){
        return bookTitle;
    }

    public String getAuthor(){
        return bookAuthor;
    }

    public double getPrice(){
        return bookPrice;
    }
}

class MainClass_12{
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setter("Java Programming", "James", 750);
        System.out.println("Title: "+obj.getTitle());
        System.out.println("Author: "+obj.getAuthor());
        System.out.println("Price: "+obj.getPrice());

    }
}
