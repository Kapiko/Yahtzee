package SchoolRelevantPrograms;
import java.util.*;
class WC{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        int count=0;
        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c != ' '){
                count++;
            }

        }
        System.out.println(count);
    }
}