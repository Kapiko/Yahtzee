import java.util.Scanner;

class PositiveNegative {

public static void main(String[]args) {

Scanner sc = new Scanner(System.in);

int n;

System.out.println("Enter an integer");

n = sc.nextInt();

if (n > 0) {
    
    System.out.println("Your number is positive!");
    
}

 else if (n == 0) {
     
     System.out.println("Your number is zero!");
   
    
    }
else {
    
    System.out.println("Your number is negative!");
    
}

}
}



