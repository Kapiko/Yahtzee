import java.util.Scanner;

    class UserInputBasics{

        public static void main (String[] args) {
            Scanner scan = new Scanner (System.in);
            
            System.out.println("Enter a number");
            
            int input = scan.nextInt();
            
            System.out.println("The entered value is");
            System.out.print(input);
            
            Scanner scan1 = new Scanner (System.in);
            
            System.out.println("Enter a decimal value");
            
            double input1 = scan1.nextDouble();
            
            System.out.println("The entered value is");
            System.out.print(input1);
    }
    
}