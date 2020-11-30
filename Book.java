public class Book {
    private String title = "Untitled";
    private String author = "Unknown";
    private int ID;
    private String ISBN;
    private boolean borrowed = false;
    private Reader borrower;
    private int readTime = 14; //days
    private Date dateBorrowed;
    private Date dateExpeceted;

    //constructor
    public Book(String name){
        this.title = name;
        //ID is generated when added to library
        this.ISBN = isbn();
    }
    public Book(String name, String author){
        this.title = name;
        this.author = author;
        this.ISBN = isbn();
    }

    public String toString(){
        return(this.title);
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
