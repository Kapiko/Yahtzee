package Arrays;

import java.util.*;
class Arrays2_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size=sc.nextInt();
        int m[]= new int[size];
        System.out.println("Enter the values");
       
        for (int i=0; i<size; i++){
            m[i]=sc.nextInt()+2;
        }
       
        System.out.println("The values increased by two are:");
        for (int i=0; i<size; i++){
            System.out.println(m[i]);
        }
    }
}