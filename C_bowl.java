import java.util.*;
public class C_bowl {
    static Scanner sc=new Scanner(System.in);
    static Random r=new Random();
    static C_bat bat=new C_bat();
    public void combat(int y){
        int ba,bo,sb=0,s=0,w1=y,nbc=0;
        System.out.println("Enter the runs");
        nbc=0;
        while(w1!=0)
        {
            ba=sc.nextInt();
            if(ba>6||ba<0){
                System.out.println("Enter the runs between 1 to 6");
                continue;
            }
            bo=r.nextInt(0,7);
            System.out.println(bo);
            if(ba==bo)
            {
                w1--;
                System.out.println("HOWZATT!!");
            }
            else if (bo==0){
                nbc++;
                if(nbc>=3)
                sb+=6;
            }                        
            else
            sb+=ba;
        System.out.println("Score: "+sb+" - "+(y-w1));
        }
        System.out.println("Target: "+(sb+1)+"\nEnter the bowls");
        w1=y;nbc=0;
        while(w1!=0)
        {
            bo=sc.nextInt();
            if(bo>6||bo<0){
                System.out.println("Enter bowls between 1 to 6");
                continue;
            }
            ba=r.nextInt(0,7);
            System.out.println(ba);
            if(ba==bo)
            {
                w1--;
                System.out.println("HOWZATT!!");
            }
            else if (bo==0){
                nbc++;
                if(nbc>=3)
                s+=6;
            }                       
            else
            s+=ba;
            System.out.println("Score: "+s+" - "+(y-w1));
            if(sb<s)
            break;
        }
        if(s>sb)
        System.out.println("You won by "+(sb-s)+" runs");
        else if(sb>s)
        System.out.println("Computer won by "+w1+" wickets");
        else{
            System.out.println("It's time for a SUPEROVER!!!");
            bat.combat(1);
        }
    }
}
