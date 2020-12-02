import java.util.ArrayList;

public class Reader {
    private String name = "Anonymous";
    private String email;
    private int id;
    private static ArrayList<Integer> ids = new ArrayList<Integer>();
    
    //constructor
    public Reader(String name, String email){
        this.name = name;
        this.email = email;
        boolean newid = false;

        while(newid = false){
            int generateid = 1 + (int)(Math.random()*9999);
            if(!(ids.contains(generateid))){
                ids.add(generateid);
                this.id = generateid;
                newid = true;
            }
        }
    }
    public String toString(){
        return this.name;
    }
}
