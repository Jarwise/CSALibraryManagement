public class Date {
    private int day = 1;
    private int month = 1;
    private int year = 2000;

    public Date(){}
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date add(int x){  // adding days to Date is usefull for calculating the expected return date for a book
        this.day += x;
        while(this.day > 30){ this.day-=30; this.month+=1;}
        while(this.month > 12){ this.month-=12; this.year+=1;}
        return(this);
    }
    public void set(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void set(int day, int month){ //two options for setting a date
        this.day = day;
        this.month = month;
    }
    public String toString(){
        return(this.day+" "+this.month+" "+this.year+"\n");
    }
    public int getDay(){
        return(this.day);
    }
    public int getMonth(){
        return(this.month);
    }
    public int getYear(){
        return(this.year);
    }
}
