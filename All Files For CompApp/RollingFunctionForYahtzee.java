    import java.util.*;

public class RollingFunctionForYahtzee
{
    int d[] = new int[5];
    Scanner sc = new Scanner(System.in);
   String temp = "";
    void FirstRoll()
    {
        {

            int f = 5;
            for(int i = 0;i<f;i++)
            {
                 d = ( ((int) ((Math.random() * (7 - 1))) + 1);
                System.out.println("Die " + (i+1) + ": " + d[i]);
            }
        }
    }

    void secondAndThirdRoll()
    {
        for (int y = 0; y<2; y++){


        System.out.println("Which dice so you want to re-roll?");
        String g = sc.next();

        while (g != '0'){
            d[Integer.valueOf(g)-1] = ( ((int) (Math.random() * (7 - 1))) + 1);

            // switch(g){

            //     case '1': d[0] = ( ((int) (Math.random() * (7 - 1))) + 1);
            //     break;

            //     case '2': d[1] = ( ((int) (Math.random() * (7 - 1))) + 1);
            //     break;

            //     case '3': d[2] = ( ((int) (Math.random() * (7 - 1))) + 1);
            //     break;

            //     case '4': d[3] = ( ((int) (Math.random() * (7 - 1))) + 1);
            //     break;

            //     case '5': d[4] = ( ((int) (Math.random() * (7 - 1))) + 1);
            //     break;

            }
        }


            
                }
}
