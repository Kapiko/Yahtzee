package Arrays;

import java.util.*;
class Arrays2_1 {
    public static void main(String [] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the String array");
        int size = sc.nextInt();
        String name[]= new String[size];
        System.out.println("Enter the names");
       
        for (int i=0; i<size; i++){
            name[i]= sc.next();
        }
       
        for (int i=0; i<size; i++){
            System.out.println("Name " + (i+1) + " is " + name[i]);
        }
    }
}