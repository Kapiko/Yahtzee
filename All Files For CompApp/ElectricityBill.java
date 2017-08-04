import java.util.Scanner;

class ElectricityBill {
    
    public static void main(String [] args){
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of units to get your electricity bill amount.");
        int units = sc.nextInt();
        
        double cost = 0;
      
        if (units < 101 ){
            cost = (units * 40) / 100.0;
        }
        else if (units <301 && units > 100){
            cost = ( (100 * 40) + ((units - 100) * 60) ) /100.0;
        }
        else if (units > 300) {
            cost = ( (100 * 40) + ( 200 * 60) + ((units - 300) * 100) ) / 100.0;
        }
       
        cost = cost + 250;
        System.out.println("Your total bill amount is Rs." + cost);
    
    }
}