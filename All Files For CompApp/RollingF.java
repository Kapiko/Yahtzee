import java.util.*;

public class RollingF
{
    Scanner sc = new Scanner(System.in);
    void FirstRoll()
    {
        {

            int f = 5;
            for(int i = 0;i<f;i++)
            {
                int d1 = ( ((int) (Math.random() * (7 - 1))) + 1);
                System.out.println("Die " + (i+1) + ": " + d1);
            }
        }
    }

    void secondAndThirdRoll()
    {
        System.
