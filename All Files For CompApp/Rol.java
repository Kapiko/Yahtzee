
import java.util.*;

public class Rol
{
    int d[] = new int[5];
    Scanner sc = new Scanner(System.in);
    String temp = "";
    void firstRoll()
    {
        {

            int f = 5;
            for(int i = 0;i<f;i++)
            {
                d[i] = ( ((int) (Math.random() * (7 - 1))) + 1);
                System.out.println("Die " + (i+1) + ": " + d[i]);
            }
        }
    }

    void secondAndThirdRoll()
    {
        int count = 0;

        System.out.println("Which dice so you want to re-roll?");

        int g = sc.nextInt();
        for (int i = 0; i<5; i++){

            g = sc.nextInt();
            switch(g){

                case '1': d[0] = ( ((int) (Math.random() * (7 - 1))) + 1);

                case '2': d[1] = ( ((int) (Math.random() * (7 - 1))) + 1);

                case '3': d[2] = ( ((int) (Math.random() * (7 - 1))) + 1);

                case '4': d[3] = ( ((int) (Math.random() * (7 - 1))) + 1);

                case '5': d[4] = ( ((int) (Math.random() * (7 - 1))) + 1);

                case '0':
                break;

            }
        }
           
        for(int i = 0; i<5; i++){ 
            System.out.println("Die " + (i+1) + ": " + d[i]);
        }

}
    }

