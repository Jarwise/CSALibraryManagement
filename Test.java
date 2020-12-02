import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        //Task 1
        Library Biblioteka = new Library("Biblioteka");
        Book book1 = new Book(8, "Harry Potter");
        Book book2 = new Book(9, "GOT");
        Biblioteka.addBook(book1);
        Biblioteka.addBook(book2);
        Reader reader1 = new Reader("Fery");
        Reader reader2 = new Reader("Jozo");
        Biblioteka.setDate(5, 5, 2020);
        System.out.print(Biblioteka.toString());

        //Task 2
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        reader1.borrowBook(book1, date);
        reader2.borrowBook(book2, date);
        reader1.borrowBook(book1, date);
        reader1.borrowBook(book2, date);
        reader1.getListOfBooks();
        reader2.getListOfBooks();
        System.out.println(reader1.toString()+": "+reader1.checkFines(date));
        System.out.println(reader2.toString()+": "+reader2.checkFines(date));
        date.set(5, 6, 2020);

        //Task 3
        reader1.returnBook("Harry Potter", Library);
        System.out.println(reader1.toString()+": "+reader1.checkFines(date));
        System.out.println(reader2.toString()+": "+reader2.checkFines(date));
        date.set(6, 7, 2020);
        for(int i = 0; i < Library.size(); i++){
            System.out.println(Library.get(i).toString());
        }

        //Task 4
        reader2.returnBook("GOT", Library);
        System.out.println(reader1.toString()+": "+reader1.checkFines(date));
        System.out.println(reader2.toString()+": "+reader2.checkFines(date));

    }
}