import java.util.*;
    
    class SumOfWeirdNumbers_Sept8thNumber1 {
    
        public static void main(String[]args) {
            System.out.println("Enter a number");
            Scanner x = new Scanner(System.in);
            
            int o = x.nextInt();
           
            int sum = 0;
            
            for(int j = 1 ; j <= o ; j ++) {
                
                if (j%2 == 0) {
                    
                    sum = sum-j;
                    
                }
                
                else {
                    
                    sum = sum+j;
                    
                }
                
            }
           
            System.out.println("Your result is" + sum);
            
        }
    }
            