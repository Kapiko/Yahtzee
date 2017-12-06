package SchoolRelevantPrograms;
import java.util.*;

class Conversions
{
    public static void main(String[]args){

        Scanner w = new Scanner(System.in);
        System.out.println("Enter 'A' to con. Dec. to Oct., Enter'B' to con. Dec. to Bin.");
        char e = w.next().charAt(0);
        System.out.println("Enter a no. to con.");
        int l = w.nextInt();

        int r;

        String s = "";

        char d[] = {'0','1','2','3','4','5','6','7'};
        char b[] = {'0' , '1'};

        switch(e){

            case 'A':

            while (l > 0){

                r = l%8;
                s = d[r] + s;
                l = l/8;
            }

            System.out.println(s);
            break;
            case 'B':

            while (l > 0){

                r = l%2;
                s = b[r] +s ;
                l= l/2;
            }

            System.out.println(s);
            break;
            default:

            System.out.println("Nope");
        }
    }
}

            