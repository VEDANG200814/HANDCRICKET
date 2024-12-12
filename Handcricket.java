import java.util.*;
public class Handcricket {
    static Scanner sc=new Scanner(System.in);
    int toss(String a)
    {
        int t=(int)(Math.random()*(1-0+1));
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
        int ba,bo,sb=0,s=0,w1=y;
        if (x==1)
        {
            System.out.println("Enter the bowls");
            while(w1!=0)
            {
                bo=sc.nextInt();
                ba=(int)(Math.random()*(6-0+1));
                System.out.println(bo);
                if(ba==bo)
                {
                    w1--;
                    System.out.println("HOWZATT!!");
                }
                else if (w1<=y-2 && bo==0) 
                sb+=6;                        
                else
                sb+=ba;
                System.out.println("Score: "+sb+" - "+(y-w1));
            }
            System.out.println("Target: "+sb+"\nEnter the runs");
            w1=y;
            while(w1!=0)
            {
                ba=sc.nextInt();
                bo=(int)(Math.random()*(6-0+1));
                System.out.println(ba);
                if(ba==bo)
                {
                    w1--;
                    System.out.println("HOWZATT!!");
                }
                else if (w1<=y-2 && bo==0) 
                s+=6;                        
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
                while(w1!=0)
                {
                    ba=sc.nextInt();
                    bo=(int)(Math.random()*(6-0+1));
                    System.out.println(bo);
                    if(ba==bo)
                    {
                        w1--;
                        System.out.println("HOWZATT!!");
                    }
                    else if (w1<=y-2 && bo==0) 
                    sb+=6;                        
                    else
                    sb+=ba;
                    System.out.println("Score: "+sb+" - "+(y-w1));
                }
                System.out.println("Target: "+sb+"\nEnter the bowls");
                w1=y;
                while(w1!=0)
                {
                    bo=sc.nextInt();
                    ba=(int)(Math.random()*(6-0+1));
                    System.out.println(ba);
                    if(ba==bo)
                    {
                        w1--;
                        System.out.println("HOWZATT!!");
                    }
                    else if (w1<=y-2 && bo==0) 
                    s+=6;                        
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
        int tr=ob.toss(c),ch,w,ba,bo,sb=0,s=0,w1;
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
                System.out.println("Enter the runs");
                while(w1!=0)
                {
                    ba=sc.nextInt();
                    if(ba>6||ba<0){
                        System.out.println("Enter the runs between 1 to 6");
                        continue;
                    }
                    bo=(int)(Math.random()*(6-0+1));
                    System.out.println(bo);
                    if(ba==bo)
                    {
                        w1--;
                        System.out.println("HOWZATT!!");
                    }
                    else if (w1<=w-2 && bo==0) 
                    sb+=6;                        
                    else
                    sb+=ba;
                    System.out.println("Score: "+sb+" - "+(w-w1));
                }
                System.out.println("Target: "+sb+"\nEnter the bowls");
                w1=w;
                while(w1!=0)
                {
                    bo=sc.nextInt();
                    if(bo>6||bo<0){
                        System.out.println("Enter bowls between 1 to 6");
                        continue;
                    }
                    ba=(int)(Math.random()*(6-0+1));
                    System.out.println(ba);
                    if(ba==bo)
                    {
                        w1--;
                        System.out.println("HOWZATT!!");
                    }
                    else if (w1<=w-2 && bo==0) 
                    s+=6;                        
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
                System.out.println("Enter the bowls");
                while(w1!=0)
                {
                    bo=sc.nextInt();
                    if(bo>6||bo<0){
                        System.out.println("Enter bowls between 1 to 6");
                        continue;
                    }
                    ba=(int)(Math.random()*(6-0+1));
                    System.out.println(ba);
                    if(ba==bo)
                    {
                        w1--;
                        System.out.println("HOWZATT!!");
                    }
                    else if (w1<=w-2 && bo==0) 
                    sb+=6;                        
                    else
                    sb+=ba;
                    System.out.println("Score: "+sb+" - "+(w-w1));
                }
                System.out.println("Target: "+sb+"\nEnter the runs");
                w1=w;
                while(w1!=0)
                {
                    ba=sc.nextInt();
                    if(ba>6||ba<0){
                        System.out.println("Enter the runs between 1 to 6");
                        continue;
                    }
                    bo=(int)(Math.random()*(6-0+1));
                    System.out.println(bo);
                    if(ba==bo)
                    {
                        w1--;
                        System.out.println("HOWZATT!!");
                    }
                    else if (w1<=w-2 && bo==0) 
                    s+=6;                        
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
            ch=(int)(Math.random()*(1-0+1));
            w=(int)(Math.random()*(10-1+1));
            w1=w;
            if(ch==1)
            {
                System.out.println("Computer chose to bat\nWickets: "+w);
                System.out.println("Enter the bowls");
                while(w1!=0)
                {
                    bo=sc.nextInt();
                    if(bo>6||bo<0){
                        System.out.println("Enter bowls between 1 to 6");
                        continue;
                    }
                    ba=(int)(Math.random()*(6-0+1));
                    System.out.println(ba);
                    if(ba==bo)
                    {
                        w1--;
                        System.out.println("HOWZATT!!");
                    }
                    else if (w1<=w-2 && bo==0) 
                    sb+=6;                        
                    else
                    sb+=ba;
                    System.out.println("Score: "+sb+" - "+(w-w1));
                }
                System.out.println("Target: "+sb+"\nEnter the runs");
                w1=w;
                while(w1!=0)
                {
                    ba=sc.nextInt();
                    if(ba>6||ba<0){
                        System.out.println("Enter the runs between 1 to 6");
                        continue;
                    }
                    bo=(int)(Math.random()*(6-0+1));
                    System.out.println(bo);
                    if(ba==bo)
                    {
                        w1--;
                        System.out.println("HOWZATT!!");
                    }
                    else if (w1<=w-2 && bo==0) 
                    s+=6;                        
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
                System.out.println("Computer chose to bowl\nWickets: "+w);
                System.out.println("Enter the runs");
                while(w1!=0)
                {
                    ba=sc.nextInt();
                    if(ba>6||ba<0){
                        System.out.println("Enter the runs between 1 to 6");
                        continue;
                    }
                    bo=(int)(Math.random()*(6-0+1));
                    System.out.println(bo);
                    if(ba==bo)
                    {
                        w1--;
                        System.out.println("HOWZATT!!");
                    }
                    else if (w1<=w-2 && bo==0) 
                    sb+=6;                        
                    else
                    sb+=ba;
                    System.out.println("Score: "+sb+" - "+(w-w1));
                }
                System.out.println("Target: "+sb+"\nEnter the bowls");
                w1=w;
                while(w1!=0)
                {
                    bo=sc.nextInt();
                    if(bo>6||bo<0){
                        System.out.println("Enter bowls between 1 to 6");
                        continue;
                    }
                    ba=(int)(Math.random()*(6-0+1));
                    System.out.println(ba);
                    if(ba==bo)
                    {
                        w1--;
                        System.out.println("HOWZATT!!");
                    }
                    else if (w1<=w-2 && bo==0) 
                    s+=6;                        
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
