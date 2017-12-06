package SchoolRelevantPrograms;
import java.util.*;
class WordFrequencyCalc
{
    public static void main(String[]args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String sent, word, temp = "";
        System.out.println("Enter a sentence");
        sent = sc.nextLine();
        System.out.println("Enter the word you  want to find the frequency of");
        word = sc.nextLine();
        sent = sent+" ";
        int length = sent.length();
        for (int y = 0; y<length; y++) //Goes through the length of the String
        {
            char ch = sent.charAt(y); //Every char in the string

            if(ch != ' ') // that means that there's a letter there
            {
                temp = temp + ch;// putting the letters in the word into a variable temp
            }
            else
            { 
                if(word.compareTo(temp)==0)
                {
                    count++;
                }

                temp = "";
            }
        }

        System.out.println("Frequency: " + count);
    }
}

