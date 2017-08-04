package Arrays;

import java.util.*;
class AlphabetFreq
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter any string: ");
        String s = in.next();
  
        s=s.toLowerCase(); //converting the string into lowercase
        int l=s.length(); //finding the length of the string
  
        char ch;
        
       
  
        
        int count=0;
        for(char i='a'; i<='z'; i++)
            {
                count = 0;
                for(int j=0; j<l; j++)
                {
                    ch=s.charAt(j); 
                    if(ch==i) 
                        count++; 
                }
                if(count!=0)
                {
                    System.out.println(i+"\t\t"+count);
                }
            }
    
            
            
             
            }
        }
        //KoolKompKidz

    
    
            
