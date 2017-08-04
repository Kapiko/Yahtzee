package Arrays;

 import java.util.*;
class Arrays4_4 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the values for the array");
        int m[]=new int[size];
        
        for (int i=0; i<size; i++){
            m[i]=sc.nextInt();
        }
        int prod=1;
        for (int i=1; i<size; i=i+2){
            prod=prod*m[i];
        }
        
        System.out.println("The product of the values at odd indexes is " + prod);
    }
}
//KoolKompKidz