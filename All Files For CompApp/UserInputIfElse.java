import java.util.Scanner;

    class UserInputIfElse{
    
    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a number");
        
        int n = s.nextInt();
        
        if (n < 100) {
            
            System.out.println ("Your number is less than 100");
            
        }
        else if (n== 100)
        {
            System.out.println ("Your number is 100");
        }
        else {
            System.out.println ("Your number is greater than 100");
            
        }
        
    }
}