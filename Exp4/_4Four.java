package Exp4;
class Library{
    Book book1 = new Book("R.S.Aggarwal", "The complete reference", 1000,"Schildt",10);
    Book book2 = new Book("Dan Brown", "Inferno", 700, "Corgi",5);
    Book book3 = new Book("J.K.Rowling", "Harry Potter", 500, "BloomsBurry", 1);

   
}

class Book{
    String author;
    String title;
    double price;
    String publisher;
    static int stock;

    public Book(String author, String title, double price, String publisher,int stock){
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        Book.stock = stock;
    }
}

public class _4Four {
    public static void main(String arg[]){

    }
}
