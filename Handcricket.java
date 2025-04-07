import java.util.*;
public class Handcricket {
    static Scanner sc=new Scanner(System.in);
    static Random r=new Random();
    int toss(String a)
    {
        int t=r.nextInt(0,2);
        if(a.equalsIgnoreCase("heads")&&t==0)
        return 1;
        else if(a.equalsIgnoreCase("tails")&&t==1)
        return 1;
        else 
        return 0;
    }
    void superover(int x,int y)
    {
        Handcricket ob=new Handcricket();
        int ba,bo,sb=0,s=0,w1=y,nbc=0;
        if (x==1)
        {
            System.out.println("Enter the bowls");
            nbc=0;
            while(w1!=0)
            {
                bo=sc.nextInt();
                if(bo>6||bo<0){
                    System.out.println("Enter bowls between 1 to 6");
                    continue;
                }
                ba=r.nextInt(0,7);
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
            System.out.println("Target: "+sb+"\nEnter the runs");
            w1=y;nbc=0;
            while(w1!=0)
            {
                ba=sc.nextInt();
                if(ba>6||ba<0){
                    System.out.println("Enter the runs between 1 to 6");
                    continue;
                }
                bo=r.nextInt(0,7);
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
            if(sb>s)
            System.out.println("You won by "+(sb-s)+" runs");
            else if(sb<s)
            System.out.println("Computer won by "+w1+" wickets");
            else
            {
                System.out.println("It's time for a SUPEROVER!!!");
                ob.superover(0,2);
            }
        }
        else{
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
            if(sb>s)
            System.out.println("You won by "+(sb-s)+" runs");
            else if(sb<s)
            System.out.println("Computer won by "+w1+" wickets");
            else{
                System.out.println("It's time for a SUPEROVER!!!");
                ob.superover(1,2);
            }
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter \'Heads\' or \'Tails\'");
        String c=sc.next();
        Handcricket ob=new Handcricket();
        int tr=ob.toss(c),ch,w,ba,bo,sb=0,s=0,w1,nbc=0;//sb is sum of computer runs
        if(tr==1)
        {
            System.out.println("You won the toss\nChoose by entering \'Bat\' or \'Bowl\'");
            c=sc.next();
            System.out.println("Enter the number of wickets");
            w=sc.nextInt();
            w1=w;
            System.out.println("You chose to "+c+"\nWickets: "+w);
            if(c.equalsIgnoreCase("Bat"))
            {
                nbc=0;
                System.out.println("Enter the runs");
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
                    System.out.println("Score: "+sb+" - "+(w-w1));
                }
                System.out.println("Target: "+(sb+1)+"\nEnter the bowls");
                w1=w;nbc=0;
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
                    System.out.println("Score: "+s+" - "+(w-w1));
                    if(sb<s)
                    break;
                }
                if(sb>s)
                System.out.println("You won by "+(sb-s)+" runs");
                else if(sb<s)
                System.out.println("Computer won by "+w1+" wickets");
                else{
                    System.out.println("It's time for a SUPEROVER!!!");
                    ob.superover(1,2);
                }
            }
            else if(c.equalsIgnoreCase("Bowl"))
            {
                nbc=0;
                System.out.println("Enter the bowls");
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
                        sb+=6;
                    }                        
                    else
                    sb+=ba;
                    System.out.println("Score: "+sb+" - "+(w-w1));
                }
                System.out.println("Target: "+sb+"\nEnter the runs");
                w1=w;nbc=0;
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
                        s+=6;
                    }                        
                    else
                    s+=ba;
                    System.out.println("Score: "+s+" - "+(w-w1));
                    if(sb<s)
                    break;
                }
                if(sb>s)
                System.out.println("You won by "+(sb-s)+" runs");
                else if(sb<s)
                System.out.println("Computer won by "+w1+" wickets");
                else{
                    System.out.println("It's time for a SUPEROVER!!!");
                    ob.superover(0,2);
                }
            }
        }
        else
        {
            System.out.println("You lost the toss");
            ch=r.nextInt(1,3);
            w=r.nextInt(1,11);
            w1=w;
            if(ch==1)
            {
                nbc=0;
                System.out.println("Computer chose to bat\nWickets: "+w);
                System.out.println("Enter the bowls");
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
                        sb+=6;
                    }                        
                    else
                    sb+=ba;
                    System.out.println("Score: "+sb+" - "+(w-w1));
                }
                System.out.println("Target: "+sb+"\nEnter the runs");
                w1=w;nbc=0;
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
                        s+=6;
                    }                        
                    else
                    s+=ba;
                    System.out.println("Score: "+s+" - "+(w-w1));
                    if(sb<s)
                    break;
                }
                if(sb>s)
                System.out.println("You won by "+(sb-s)+" runs");
                else if(sb<s)
                System.out.println("Computer won by "+w1+" wickets");
                else{
                    System.out.println("It's time for a SUPEROVER!!!");
                    ob.superover(0,2);
                }
            }
            else
            {
                nbc=0;
                System.out.println("Computer chose to bowl\nWickets: "+w);
                System.out.println("Enter the runs");
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
                    System.out.println("Score: "+sb+" - "+(w-w1));
                }
                System.out.println("Target: "+(sb+1)+"\nEnter the bowls");
                w1=w;nbc=0;
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
                    System.out.println("Score: "+s+" - "+(w-w1));
                    if(sb<s)
                    break;
                }
                if(sb>s)
                System.out.println("You won by "+(sb-s)+" runs");
                else if(sb<s)
                System.out.println("Computer won by "+w1+" wickets");
                else{
                    System.out.println("It's time for a SUPEROVER!!!");
                    ob.superover(1,2);
                }                
            }
        }
    }    
}