package SchoolRelevantPrograms;
import java.util.*;

class Palin{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Check if its a palindrome");
        String s = sc.next();
        String Rev = "";
        boolean result = false;
        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            Rev = Rev + c;

        }
        s = s.toUpperCase();
        Rev = Rev.toUpperCase();
        
        if (s == Rev){
            System.out.println("'Tis  a palindrome");
        }
        else{
            System.out.println("It is not  a palindrome");
        }
    }
}