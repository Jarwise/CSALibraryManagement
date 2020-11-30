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

    public Date add(int x){
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
    public void set(int day, int month){
        this.day = day;
        this.month = month;
    }
    public String toString(){
        return(this.day+" "+this.month+" "+this.year+"\n");
    }
    static boolean compareDate(Date bigger, Date smaller){
        long B = bigger.year * 365 + bigger.month * 12 + bigger.day;
        long S = smaller.year * 365 + smaller.month * 12 + smaller.day;
        if(B > S) return(true);
        else return(false);
    }
}
