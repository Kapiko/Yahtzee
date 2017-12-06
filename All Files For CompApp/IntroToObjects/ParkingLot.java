package IntroToObjects;
import java.util.*;
class ParkingLot{
    int vno;
   int hours;
    double bill;
    
    ParkingLot(){
        vno = 0;
        hours = 0;
        bill = 0.0;
    }
    
    
    void input(){
        System.out.println("Enter Vehicle Number and hours");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();
        vno =x;
        hours = z;
    }
    
    void discount(){
        double q=0.0;
        
        bill = hours*100;
         
            
            
            
        }
        
        void display(){
            System.out.println("Your bill(Vehicle Number " + vno + "  ) at the rate of 100 ruppees per hour is: " + bill);
        }
    }