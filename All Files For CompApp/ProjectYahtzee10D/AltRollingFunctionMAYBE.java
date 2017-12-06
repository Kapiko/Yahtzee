package ProjectYahtzee10D;
import java.util.*;
class AltRollingFunctionMAYBE{
static int d[] = new int[5];
    static void secondAndThirdRoll()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which dice so you want to re-roll?");
        
        for(int i=0;i<5;i++){
            System.out.println("Do you want to re-roll Dice Number " + (i+1) +" ? (YES or NO)");
            String g = sc.next();
            if( g=="YES"){
                d[i] = ( ((int) (Math.random() * (7 - 1))) + 1);
            }
            else if(g == "NO"){
                d[i] = d[i];
            }
            
        }
        int f = 5;
        for(int i = 0;i<f;i++)
        {

            System.out.println("Die " + (i+1) + ": " + d[i]);
        }
    }
}