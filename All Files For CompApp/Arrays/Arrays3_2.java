package Arrays;

import java.util.*;
class Arrays3_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Enter the names of the students.");
        String names[] = new String[5];
        for (int i=0; i<5; i++){
            names[i]=sc.next();
        }
       
        System.out.println("Enter the marks of the students in maths.");
        int maths[] = new int[5];
        for (int i=0; i<5; i++){
            maths[i]=sc.nextInt();
        }
       
        System.out.println("Enter the marks of the students in science.");
        int science[] = new int[5];
        for (int i=0; i<5; i++){
            science[i]=sc.nextInt();
        }
       
        System.out.println();
        System.out.println("Name     Marks     Grade");
        System.out.println("************************");
        for (int i=0; i<5; i++){
            System.out.print(names[i]);
            System.out.print("    " + (maths[i]+science[i]));
            if ((maths[i]+science[i])>=50){
                System.out.print("     pass ");
            }
            else {
                System.out.print("     fail ");
            }
            System.out.println();
        }
    }
}