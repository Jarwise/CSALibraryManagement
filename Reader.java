import java.util.ArrayList;

public class Reader {
    private String name = "Anonymous";
    private String email = "-";
    private int id;
    private static ArrayList<Integer> ids = new ArrayList<Integer>();
    
    //constructor
    public Reader(){
        this.id = generateId();
    }
    public Reader(String name){
        this.name = name;
        this.id = generateId();
    }
    public Reader(String name, String email){
        this.name = name;
        this.email = email;
        this.id = generateId();
    }
    private int generateId(){
        boolean newid = false;
        int generateid = 0;

        while(!newid){
            generateid = 1 + (int)(Math.random()*9999);
            if(!(ids.contains(generateid))){
                ids.add(generateid);
                newid = true;
            }
        }
        return generateid;
    }
    public String toString(){
        return(this.name);
    }
}
