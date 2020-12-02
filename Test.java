import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        //Task 1
        Library Biblioteka = new Library("Biblioteka");
        Book book1 = new Book(8, "Harry Potter");
        Book book2 = new Book("GOT");
        Biblioteka.addBook(book1);
        Biblioteka.addBook(book2);
        Reader reader1 = new Reader("Fery");
        Reader reader2 = new Reader("Jozo");
        Biblioteka.addReader(reader1);
        Biblioteka.addReader(reader2);
        Biblioteka.setDate(5, 5, 2020);
        System.out.print(Biblioteka.toString() + "\n");

        //Task 2
        Date today = new Date(); today = Biblioteka.getDate();
        book1.borrow(reader1, today); //borrowing book1 to reader1 and book2 to reader2
        book2.borrow(reader2, today);
        book1.borrow(reader1, today); //these two lines will print out errors as the books are already borrowed
        book2.borrow(reader1, today);
        System.out.print("\n");
        System.out.println(book1.toString()+": "+Biblioteka.checkFinesReally(book1));
        System.out.print("\n");
        System.out.println(book2.toString()+": "+Biblioteka.checkFinesReally(book2));
        Biblioteka.setDate(5, 6, 2020);

        //Task 3
        book1.returnBook();
        System.out.print("\n");
        System.out.println(book1.toString()+": "+Biblioteka.checkFinesReally(book1));
        System.out.print("\n");
        System.out.println(book2.toString()+": "+Biblioteka.checkFinesReally(book2));
        System.out.print("\n");
        Biblioteka.setDate(6, 7, 2020);
        System.out.print(Biblioteka.toString() + "\n");

        //Task 4
        book2.returnBook();
        System.out.print("\n");
        System.out.println(book1.toString()+": "+Biblioteka.checkFinesReally(book1));
        System.out.print("\n");
        System.out.println(book2.toString()+": "+Biblioteka.checkFinesReally(book2));
    }
}