public class Book {
    private String name = "Untitled";
    private String author = "Unknown";
    private int numberOfPages = 0;
    private boolean borrowed = false;
    private int readTime = 14; //days
    private Date dateBorrowed;

    //constructor
    public Book(){}
    public Book(String name){this.name = name;}
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String toString(){
        return(this.name);
    }
    public boolean free(){
        return(!this.borrowed);
    }
    public void borrow(Date date){
        this.borrowed = true;
        this.dateBorrowed = date;
    }
    public void returnBook(){this.borrowed = false;}
    public void setReadTime(int readTime){
        this.readTime = readTime;
    }
    public int getReadTime(){
        return(this.readTime);
    }
    public Date dateBorrowed(){
        return(this.dateBorrowed);
    }
}
