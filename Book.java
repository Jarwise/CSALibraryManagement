public class Book {
    private String title = "Untitled";
    private String author = "Unknown";
    private int ID = 1;
    private String ISBNq;
    private boolean borrowed = false;
    private Reader borrower;
    private int readTime = 14; //days
    private Date dateBorrowed;
    private Date dateExpected;

    //constructor
    public Book(String name){
        this.title = name;
        this.ISBNq = ISBN.isbn();
    }
    public Book(int ID, String name){
        this.title = name;
        this.ID = ID;
        this.ISBNq = ISBN.isbn();
    }
    public Book(int ID, String name, String ISBN){
        this.ID = ID;
        this.title = name;
        this.ISBNq = ISBN;
    }

    public String toString(){
        String str = this.title;// + " " + this.ISBNq + " " + this.ID;
        return(str);
    }
    public boolean free(){
        return(!this.borrowed);
    }
    public int getID(){
        return(this.ID);
    }
    public void borrow(Reader reader, Date date){
        if(this.free()){
            this.borrowed = true;
            this.dateBorrowed = date;
            this.dateExpected = this.dateBorrowed.add(this.readTime);
            this.borrower = reader;
        }
        else System.out.println("This book is currently unavailable");
    }
    public void returnBook(){
        this.borrowed = false;
        this.dateExpected = null;
        this.borrower = null;
    }
    public void setReadTime(int readTime){
        this.readTime = readTime;
    }
    public int getReadTime(){
        return(this.readTime);
    }
    public Date dateBorrowed(){
        return(this.dateBorrowed);
    }
    public String getBorrower(){
        return(this.borrower.toString());
    }
}
