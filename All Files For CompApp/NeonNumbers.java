import java.util.Scanner;
    
    class NeonNumbers {
        
        
            
            public static void main(String[]args) {
                System.out.println("ffgg");
                Scanner q = new Scanner(System.in);
                int h = 0;
                int p = q.nextInt();
                int w = 0;
                
                
                for(int o = p  ; o != 0 ; o = o/10) {
                    
                    w = w*10;
                    w = w + p%10;
                    ;
                    
                    System.out.println(w);
                    
                   
                
            }

        }
        
    }
                    
                    
                    
                    

