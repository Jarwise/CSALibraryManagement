import java.util.math;
public class ISBN {
    static String isbn(){
        long sum = 0;
        String str = "";
        for(int i = 0; i < 9; i++){
            int x = (int)(Math.random()*11);
            if(x < 10) str = str + x;
            else str = str + "X";
            sum += (10-i) * x;
        }
        sum %= 11;
        sum = 11 - sum;
        str = str + sum;
        return(str);
    }
}