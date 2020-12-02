public class Book {
    private String title = "Untitled";
    private String author = "Unknown";
    private int ID = 1;
    private String Isbn;
    private boolean borrowed = false;
    private Reader borrower;
    private int readTime = 14; //days    <-- this can changed based on the lenght of the book in function setReadTime()
    private Date dateBorrowed;
    private Date dateExpected;

    //constructor(s)
    public Book(String name){
        this.title = name;
        this.Isbn = ISBN.isbn();
    }
    public Book(int ID, String name){
        this.title = name;
        this.ID = ID;
        this.Isbn = ISBN.isbn();
    }
    public Book(int ID, String name, String ISBNX){
        this.ID = ID;
        this.title = name;
        this.Isbn = ISBNX;
    }

    public String toString(){
        String str = this.title;// + " " + this.Isbn + " " + this.ID;
        return(str);
    }
    public boolean free(){
        return(!this.borrowed);
    }
    public int getID(){
        return(this.ID);
    }
    public void borrow(Reader reader, Date date){  // my alternative for book.get(reader), this felt more natural to "borrow"
        if(this.free()){
            this.borrowed = true;
            this.dateBorrowed = date;
            this.dateExpected = this.dateBorrowed.add(this.readTime);
            this.borrower = reader;
        }
        else System.out.println("This book is currently unavailable");
    }
    public void returnBook(Date today){   // couldn't use book.return() because this keyword is already in use :D
        this.borrower.addFines(Library.checkFines(today, this.dateBorrowed.add(this.readTime)));
        this.borrowed = false;
        this.dateBorrowed = null;
        this.dateExpected = null;
        this.borrower = null;
    }
    public void setReadTime(int readTime){
        this.readTime = readTime;
    }
    public int getReadTime(){
        return(this.readTime);
    }
    //public Date dateBorrowed(){
     //   return(this.dateBorrowed);
   // }
    public Date dateExpected(){
        return(this.dateExpected);
    }
    public String getBorrower(){
        if(this.borrower!=null) return(this.borrower.toString());
        else return("*J7 !/Q");
    }
}
