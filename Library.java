import java.util.ArrayList;
public class Library{
    private String name = "Untitled Library";
    private ArrayList books = new ArrayList();
    private ArrayList readers = new ArrayList();
    private Date today = new Date(1, 1, 2000);

    public Library(){}
    public Library(String name){
        this.name = name;
    }

    public void setDate(int day, int month){
        this.today.set(day, month);
    }
    public void setDate(int day, int month, int year){
        this.today.set(day, month, year);
    }
    public Date getDate(){
        return(this.today);
    }
    public Book searchBook(String name){
        for(int i = 0; i < this.books.size(); i++){
            if(this.books.get(i).toString().equals(name)){
                return(this.books.get(i));
                break;
            }
        }
        return(null);
    }
    public Book searchBook(int bookID){
        for(int i = 0; i < this.books.size(); i++){
            if(this.books.get(i).getID() == bookID){
                return(this.books.get(i));
                break;
            }
        }
        return(null);
    }
    public void addReader(Reader reader){
        this.readers.add(reader);
    }
    public void addBook(Book book){
        this.books.add(book);
    }
    public void checkReaders(){
        for(int i = 0; i < this.readers.size(); i++){
            System.out.println(this.readers.get(i).toString()+": "+this.readers.get(i).checkFines(this.today));
        }
    }
    static int checkFines(Date returned, Date expected){           //the original function proposed by Dusan
        if(returned.getYear() > expected.getYear()) return(10000);
        if(returned.getYear() < expected.getYear()) return(0);
        if(returned.getYear() == expected.getYear()){
            if(returned.getMonth() > expected.getMonth()) return(500*(returned.getMonth() - expected.getMonth()));
            if(returned.getMonth() < expected.getMonth()) return(0);
            if(returned.getMonth() == expected.getMonth()){
                if(returned.getDay() > expected.getDay()) return(15*(returned.getDay() - expected.getDay()));
                if(returned.getDay() <= expected.getDay()) return(0);
            }
        }
        return(-2);
    }
    public int checkFinesReally(Book book){                      //imporved function updated to refer to a specific book
        if(book.free()){ System.out.println("This book is not in anyone's possesion"); return(-1);}
        else{
            int x = Library.checkFines(today, book.dateBorrowed().add(book.getReadTime()));
            if(x == 0){ System.out.println("There is no fine assigned to this book yet, book is borrowed by "+book.getBorrower()); return(-1);}
            else { System.out.println("book "+book.toString()+" is fined "+x+" coins to "+book.getBorrower()); return(x);}
        }
    }
    public String toString(){
        String str = this.name + "\nBooks: \n";
        for(int i = 0; i < this.books.size(); i++){
            str = str + " " + this.books.get(i).toString() + "\n";
        }
        str = str + "Readers: \n";
        for(int i = 0; i < this.readers.size(); i++){
            str = str + " " + this.readers.get(i).toString() + "\n";
        }
        str = str + "Date: \n" + today.toString();
        return(str);
    }
}