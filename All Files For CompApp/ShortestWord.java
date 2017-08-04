import java.util.*;
class ShortestWord
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        String smallest = "";
        String temp = "";
        
        
        
        
        
        
        for(int i=0; i<s.length() ;i++)
        {
           char c = s.charAt(i);
           
           if(c != ' ')
           {
               smallest = smallest+c;
                
           