package IntroToObjects;
import java.util.*;
class BookFair{
    String BName;
    double price;
    double DPrice;
    
    BookFair(){
        BName = " ";
        price = 0.0;
    }
    
    
    void input(){
        System.out.println("Enter name and price of the book");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        double z = sc.nextDouble();
        BName =x;
        price = z;
    }
    
    void discount(){
        double q=0.0;
        
        if (price<=1000){
             q =  price - ((0.02)*price);
        }
        
        else if(price>1000 && price<=3000){
            q = price - ((0.1)*price);
        }
        
        else if (price>3000){
             q = price - ((0.15)*price);
            }
         
            
            
            DPrice = q;
        }
        
        void display(){
            System.out.println("Book Name:  " + BName + "  OG Price:  " + price + "Price after  discount:" + DPrice);
        }
    }
    
    
    
    
    
    

        
   
   
    
    