package Arrays;

import java.util.*;
class Arrays2_3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for the arrays");
        int size= sc.nextInt();
        int m[]=new int[size];
        int n[]=new int[size];
        int sum[]=new int[size];
       
        System.out.println("Enter the elements of the first array");
        for (int i=0; i<size; i++){
            m[i]=sc.nextInt();
        }
       
        System.out.println("Enter the value for the second array");
        for (int i=0; i<size; i++){
            n[i]=sc.nextInt();
        }
       
        for (int i=0; i<size; i++){
            sum[i]=m[i]+n[i];
        }
       
        System.out.println("The elements of the sum array are ");
        for (int i=0; i<size; i++){
            System.out.println(sum[i]);
        }
    }
}
           