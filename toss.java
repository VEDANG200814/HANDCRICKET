import java.util.*;
public class toss {
    static Scanner sc=new Scanner(System.in);
    static Random r=new Random();
    public int tossing(String a)
    {
        int t=r.nextInt(0,2);
        if(a.equalsIgnoreCase("heads")&&t==0)
        return 1;
        else if(a.equalsIgnoreCase("tails")&&t==1)
        return 1;
        else 
        return 0;
    }
}
