import java.util.*;
    class Loop{
        public static void main(String[]args){
           Scanner p = new Scanner (System.in);
           System.out.println("Enter the upper limit");
           double limit = p.nextDouble();
           double sum = 0;
           double prod = 1.0;
           
           double numer = 1.0;
           double denomer = 1.0;
           double current=1.0;
           for(double i = 2.0; i <= limit ; i++){
                 
                double latest = i;
                numer = numer + latest;
                denomer = denomer*latest;
                current = numer/denomer;
            }
               System.out.println("The answer is" + current);
               
        }
    }
               
               //KoolKompKidz
               