package library.company;


import java.sql.SQLOutput;
import java.util.ArrayList;

/* Create a library management system which is capable of issuing books to the students.
    Books should have info like:
    1) Book Name
    2) Book Author
    3) Issued to
    4) Issued on
   User should be able to add books,return issued books, issue books,
   Assume that all the users are registered with their name in the central database
 */
class Book{

    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book had been added to the Library" );
        this.books.add(book);
    }
    public void issueBook (Book book, String Issued_to){
        System.out.println("The book had been issued from the Library"+ Issued_to);
        this.books.remove(book);
    }


    public void returnBook (Book b){
        System.out.println("The book has been returned ");
        this.books.add(b);
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorthims", "CLRS");
        bk.add(b1);
        Book b2 = new Book("Algorthims2", "CLRS2");
        bk.add(b2);
        Book b3 = new Book("Algorthims3", "CLRS3");
        bk.add(b3);
        Book b4 = new Book("Algorthims4", "CLRS4");
        bk.add(b4);
        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("algo4", "MyAuthor"));
        System.out.println(l.books);
        l.issueBook(b2, "harry");
        System.out.println("New List");
        System.out.println(l.books);

    }
}
