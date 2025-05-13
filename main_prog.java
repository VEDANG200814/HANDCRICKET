import java.util.*;
public class main_prog {
    static C_bat bat=new C_bat();
    static C_bowl bowl=new C_bowl();
    static toss ts=new toss();
    static Scanner sc=new Scanner(System.in);
    static Random r=new Random();
    public static void main(String[] args) {
        System.out.println("Enter \'Heads\' or \'Tails\'");
        String c=sc.next();
        int tr=ts.tossing(c),ch,w;
        if(tr==1)
        {
            System.out.println("You won the toss\nChoose by entering \'Bat\' or \'Bowl\'");
            c=sc.next();
            System.out.println("Enter the number of wickets");
            w=sc.nextInt();
            System.out.println("You chose to "+c+"\nWickets: "+w);
            if(c.equalsIgnoreCase("Bat")){
                bowl.combat(w);
            }
            else if(c.equalsIgnoreCase("Bowl")){
                bat.combat(w);
            }
        }
        else
        {
            System.out.println("You lost the toss");
            ch=r.nextInt(1,3);
            w=r.nextInt(1,11);
            if(ch==1){
                System.out.println("Computer chose to bat\nWickets: "+w);
                bat.combat(w);
            }
            else{
                System.out.println("Computer chose to bowl\nWickets: "+w);
                bowl.combat(w);
            }
        }
    }
}
