import java.util.ArrayList;
public class Reader {
    private ArrayList listOfBooks = new ArrayList(0);
    private String name = "Anonymous";
    private int closedFines = 0, fines = 0;
    private int BOOKFINE = 10; // constant fine for the delayed returning of one book 

    //constructor
    public Reader(String name){
        this.name = name;
    }

    public String toString(){return(this.name);}
    public void borrowBook(Book book, Date date){
        if(book.free()){
            this.listOfBooks.add(book);
            book.borrow(date);
        }
        else System.out.println("Requested book is not available at the moment");
    }
    public void returnBook(String name, ArrayList Library){
        for(int i = 0; i < this.listOfBooks.size(); i++){
            if(this.listOfBooks.get(i).name.equals(name)){
                Book book = this.listOfBooks.get(i);
                book.returnBook();
                Library.add(book);
                this.listOfBooks.remove(i);
                break;
            }
        }
    }
    public void getListOfBooks(){
        System.out.println(this.name+":");
        for(int i = 0; i < this.listOfBooks.size(); i++){
            System.out.println(listOfBooks.get(i).toString());
        }
    }
    public int checkFines(Date today){
        this.fines = this.closedFines;
        for(int i = 0; i < this.listOfBooks.size(); i++){
            Book book = listOfBooks.get(i);
            if(compareDate(today, book.dateBorrowed().add(book.getReadTime()))){
                this.fines += BOOKFINE; // can be replaces with fine per day of delay
            }
        }
        return(this.fines);
    }

}
