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
    public int checkFines(Date returned, Date expected){

    }
    public String toString(){
        String str = "Books: \n";
        for(int i = 0; i < this.books.size(); i++){
            str = str + this.books.get(i).toString() + "\n";
        }
        str = str + "Readers: \n";
        for(int i = 0; i < this.readers.size(); i++){
            str = str + this.readers.get(i).toString() + "\n";
        }
        return(str);
    }
}