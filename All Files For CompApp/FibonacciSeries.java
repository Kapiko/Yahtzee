import java.util.*;

class FibonacciSeries{  

    public static void main(String args[])  {
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter the number the series high limit");
        int limit = sc.nextInt();
        int n1=0,n2=1,n3=0;
        System.out.print(n1 + "," + n2); //printing 0 and 1    

        for(int i=2;n3<limit;i++)//loop starts from 2 because 0 and 1 are already printed    
        {    
            n3=n1+n2;  
            if (n3<limit) {
            System.out.print(","+n3);   
        }
            n1=n2;    
            n2=n3;
            
        }    

    }
}  
