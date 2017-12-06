package ProjectYahtzee10D;
import java.io.*;
import java.util.*;
class YAHTZEE
{
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int d[] = new int[5];
    int score;
    String name;    
    static boolean Flags[]= {true, true, true, true, true, true, true, true, true, true, true, true, true};
    static boolean Flags2[]= {true, true, true, true, true, true, true, true, true, true, true, true, true}; 
    static YAHTZEE p1 = new YAHTZEE();
    static YAHTZEE p2 = new YAHTZEE();
    static double counter = 0.0;
    public static void main(String[]args)throws IOException 
    {
        p1.score = 0;
        p2.score = 0;
        p1.name="";
        p2.name="";
        menu();

    }

    static void menu()throws IOException
    {
        k:while(true){
            System.out.println("Enter 1 for the Rules, 2 for the Categories, 3 to Play");
            String option=sc.nextLine();
            s:switch (option)
            {
                case "1":
                System.out.println("WELCOME TO YAHTZEE!");
                System.out.println("In this game, you will try to roll specific combinations of five dice");
                System.out.println("to get the maximum number of points you can! Here's a general overview of the rules.");
                System.out.println("The combinations can be divided into two types; Digits and Special combos.");
                System.out.println("For digits, your score will be the sum of all of the occurences of a single digit,");
                System.out.println("For example, sum of all the SIXES, or TWOS.");
                System.out.println("For Special Combinations, you must fulfill certain certain criteria to get points,");
                System.out.println("For example, Full House, which means three of one number and two of another number,");
                System.out.println("or Yahtzee, which means five of one number.");
                System.out.println("There are specific letters that will be displayed to choose the category you want");
                System.out.println("You can choose each category ONLY ONCE. If you choose a category without meeting");
                System.out.println("the necessary criteria, your score in that category is ZERO, and you can't choose");
                System.out.println("it later.");
                System.out.println("Enter anything to return to the main menu");
                System.out.println("");
                option=sc.nextLine();
                break s;

                case "2":
                System.out.println("The Categories in the Game are displayed below:");
                System.out.println("'Three of a Kind':  (three of one number) :Total of All Dice");
                System.out.println("'Four of a Kind': (four of one number): Total of All Dice");
                System.out.println("'Yahtzee':  (five of one number): 50 Points");
                System.out.println("'Full House': (two of one number and three of the same or another): 25 points");
                System.out.println("'Large Straight:  (5 that succeed each other):40 points");
                System.out.println("'Small Straight:, (Four numbers that succeed each other): 30 points");
                System.out.println("'Chance':  (total of all dice)");
                System.out.println("'Ones':  (Sum of all the 'ones' in your roll)");
                System.out.println("'Twos': (Sum of all the 'twos' in your roll)");
                System.out.println("'Threes': (Sum of all the 'threes' in your roll)");
                System.out.println("'Fours': (Sum of all the 'fours' in your roll)");
                System.out.println("'Fives': (Sum of all the 'fives' in your roll)");
                System.out.println("'Sixes': (Sum of all the 'sixes' in your roll)");
                System.out.println("Enter anything to return to the main menu");
                option=sc.nextLine();
                break s;

                case "3":
                Play();
                break k;

                default:
                System.out.println("Enter 1,2, or 3. It's really not that Complicated!");
                try        
                {
                    Thread.sleep(1000);
                } 
                catch(InterruptedException ex) 
                {
                    Thread.currentThread().interrupt();
                }
                System.out.println("");
                break s;

            }
        }	
    }

    static void Play()throws IOException{
        boolean f = true;
        while(f==true)
        {
            System.out.println("How many players? (1 or 2)");
            String x = sc.next();
            switch(x)
            {

                case "1":
                enterName();
                for(int i =0;i<14;i++){
                    p1.PlayRound();
                    System.out.println("The next round will commence shortly.");

                    try        
                    {
                        Thread.sleep(3000);
                    } 
                    catch(InterruptedException ex) 
                    {
                        Thread.currentThread().interrupt();
                    }

                }
                System.out.println("");
                System.out.println("Your Final Score is "+ p1.score + "! Thanks for Playing!");
                break;
                case "2":
                enterName2();
                for(int i =0;i<14;i++)
                {
                    p1.PlayRound();
                    counter = counter+1;
                    System.out.println("Player 2's Round will commence shortly.");
                    try        
                    {
                        Thread.sleep(3000);
                    } 
                    catch(InterruptedException ex) 
                    {
                        Thread.currentThread().interrupt();
                    }

                    p2.PlayRound();
                    counter = counter+1;
                    System.out.println("");
                    System.out.println("Player 1's Round will commence shortly.");
                    try      //Stop for 3 seconds  
                    {
                        Thread.sleep(3000);
                    } 
                    catch(InterruptedException ex) 
                    {
                        Thread.currentThread().interrupt();
                    }

                }
                System.out.println("");
                System.out.println(p1.name+"'s Final Score is "+ p1.score + "!");
                System.out.println(p2.name+"'s Final Score is "+ p2.score + "!");

                if(p1.score>p2.score)
                {
                    System.out.println(p1.name + " is the winner! But we are all winners here. Thanks for Playing!");
                }
                else if(p1.score<p2.score){
                    System.out.println(p2.name + " is the winner! But we are all winners here. Thanks for Playing!");
                }
                else if(p1.score==p2.score){
                    System.out.println("A TIE?! Well, we are all winners then!");

                }
                f=false;
                break;

                default:
                System.out.println("PLEASE ENTER 1 OR 2");

            }
        }

    }

    static void enterName() 
    {
        l:while (true)
        {
            Scanner sc10;
            int count1=0;
            int count2=0;
            p:while (true)
            {
                sc10=new Scanner(System.in);
                System.out.println("Enter Your Name");
                p1.name=sc10.nextLine();

                q:for (int m=0;m<p1.name.length();m++)
                {
                    if(p1.name.length()>20)
                    {
                        System.out.println("The Name is too long!. Try again." );
                        break q;
                    }

                    if((p1.name.charAt(m)<=122 && p1.name.charAt(m)>=65 ))
                    {
                        count1++;
                    }

                    else
                    {

                        System.out.println("Enter letters only. No special characters or numbers allowed. Try again" );
                        count1=0;
                        break q;
                    }
                }
                if(count1==p1.name.length())
                {

                    break l;
                }
                sc10.close();
            }
        }

    }      

    static void enterName2()
    {
        l:while (true)
        {
            Scanner sc10;
            int count1=0;
            int count2=0;
            p:while (true)
            {
                sc10=new Scanner(System.in);
                System.out.println("Enter Player 1's Name");
                p1.name=sc10.nextLine();
                p1.name=p1.name.toLowerCase();

                q:for (int m=0;m<p1.name.length();m++)
                {
                    if(p1.name.length()>20){
                        System.out.println("The Name is too long!. Try again." );
                        break q;
                    }

                    if((p1.name.charAt(m)<=122 && p1.name.charAt(m)>=97 ))
                    {
                        count1++;
                    }

                    else{
                        System.out.println("Enter letters only. No special characters or numbers allowed. Try again" );
                        count1=0;
                        break q;
                    }
                }
                if(count1==p1.name.length())
                {

                    break l;
                }
                sc10.close();
            }
        }

        l:while (true)
        {
            Scanner sc10;
            int count1=0;
            int count2=0;
            p:while (true)
            {
                sc10=new Scanner(System.in);
                System.out.println("Enter Player 2's Name");
                p2.name=sc10.nextLine();
                p2.name=p2.name.toLowerCase();

                q:for (int m=0;m<p2.name.length();m++)
                {

                    if(p2.name.length()>20)
                    {
                        System.out.println("The Name is too long!. Try again." );
                        break q;
                    }

                    if((p2.name.charAt(m)<=122 && p2.name.charAt(m)>=97 ))
                    {
                        count1++;
                    }

                    else
                    {
                        System.out.println("Enter letters only. No special characters or numbers allowed. Try again" );
                        count1=0;
                        break q;
                    }
                }
                if(count1==p2.name.length())
                {

                    break l;
                }
                sc10.close();
            }
        }
    }

    static void secondAndThirdRoll()
    {
        Scanner sc = new Scanner(System.in);

        /* String g  ="";
        for(int i=0;i<5;i++){
        System.out.println("Do you want to re-roll Dice Number " + (i+1) +" ? (YES or NO)");
        g = sc.next();

        if( g.equals("YES") == true){

        d[i] = ( ((int) (Math.random() * (7 - 1))) + 1);
        }
        else if(g.equals("NO") == true){
        d[i] = d[i];
        }

        }*/
        System.out.println("Which dice so you want to re-roll? Enter anything other than 1 through 5 to stop rolling. ");
        for (int i=0; i<5; i++)
        {

            String doe= sc.nextLine();
            doe = doe.replaceAll("\\s+","");

            if(doe.equals("1") ==false && doe.equals("2") ==false && doe.equals("3") ==false && doe.equals("4") ==false && doe.equals("5") ==false)
            {

                break;
            }
            else
            {
                int di = Integer.valueOf(doe);
                //System.out.println("RE-Rolls Remaining: "+ (4-i));
                d[di-1] = ( ((int) (Math.random() * (7 - 1))) + 1);
            }

        }
        System.out.println("");
        System.out.println("The Dice are rolling...");         
        try        
        {
            Thread.sleep(2000);
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        printDICE();
    }

    static void PlayRound()throws IOException
    {
        if(counter%2==0.0)
        {

            System.out.print(p1.name + "'s turn!");

        }
        else
        {
            System.out.println(p2.name +"'s turn!");
        }
        int f = 5;
        for(int i = 0;i<f;i++)
        {
            d[i] = ( ((int) (Math.random() * (7 - 1))) + 1);
        }
        System.out.println("");
        System.out.println("The Dice are Rolling...");
        try        
        {
            Thread.sleep(3000);
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        printDICE();
        x:for (int y=0;y<2;y++)
        {
            System.out.println("Do you want to re-roll?");
            boolean s = true;
            d:while (s==true)
            {
                String g = br.readLine();
                if( g.equalsIgnoreCase("YES") == true)
                {
                    secondAndThirdRoll();
                    break d;
                }
                else if(g.equalsIgnoreCase("NO") == true)
                {
                    s = false;
                    break x;
                }
                else if(g.equalsIgnoreCase("YES") == false && g.equalsIgnoreCase("NO") ==  false){
                    System.out.println("Please Co-Operate. say YES or NO");

                }
            }
        }

        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes =0; 

        for(int i = 0; i < 5; i++) 
        {
            if(d[i] == 1) 
            {
                ones = ones + 1;
            }
            else if(d[i] == 2) 
            {
                twos = twos + 1;
            }
            else if(d[i] == 3) 
            {
                threes = threes + 1;
            }
            else if(d[i] == 4) 
            {
                fours = fours + 1;
            }
            else if(d[i] == 5) 
            {
                fives = fives + 1;
            }
            else if(d[i] == 6) 
            {
                sixes = sixes + 1;
            }
        }

        if(counter%2==0.0)
        {

            System.out.println("Enter the category you want to choose. You have the following Categories remaining.");
            if(p1.Flags[0] == true)
            {

                System.out.println("To Pick 'Three of a Kind', enter 'a' (three of one number)");
            }

            if(p1.Flags[1] ==true)
            {

                System.out.println("To Pick 'Four of a Kind', enter 'b' (four of one number)");
            }
            if(p1.Flags[2] == true)
            {

                System.out.println("To Pick 'Yahtzee', enter 'c' (five of one number)");
            }
            if(p1.Flags[3] == true)
            {

                System.out.println("To Pick 'Full House', enter 'd'(two of one number and three of the same or another)");
            }
            if(p1.Flags[4] == true)
            {

                System.out.println("To Pick 'Large Straight', enter 'e' (5 that succeed each other)");
            }
            if(p1.Flags[5] == true)
            {

                System.out.println("To Pick 'Small Straight', enter 'f' (Four numbers that succeed each other)");
            }
            if(p1.Flags[6] == true)
            {

                System.out.println("To Pick 'Chance', enter 'g' (total of all dice)");
            }
            if(p1.Flags[7] == true)
            {

                System.out.println("To Pick 'Ones', enter '1' (Sum of all the 'ones' in your roll)");
            }
            if(p1.Flags[8] == true)
            {

                System.out.println("To Pick 'Twos', enter '2'(Sum of all the 'twos' in your roll)");
            }
            if(p1.Flags[9] == true)
            {

                System.out.println("To Pick 'Threes', enter '3'(Sum of all the 'threes' in your roll)");
            }
            if(p1.Flags[10] == true)
            {

                System.out.println("To Pick 'Fours', enter '4'(Sum of all the 'fours' in your roll)");
            }
            if(p1.Flags[11] == true)
            {

                System.out.println("To Pick 'Fives', enter '5'(Sum of all the 'fives' in your roll)");
            }
            if(p1.Flags[12] == true)
            {

                System.out.println("To Pick 'Sixes', enter '6'(Sum of all the 'sixes' in your roll)");
            }
        }
        else 
        {
            System.out.println("Enter the category you want to choose. You have the following Categories remaining.");
            if(p2.Flags[0] == true)
            {

                System.out.println("To Pick 'Three of a Kind', enter 'a' (three of one number)");
            }

            if(p2.Flags[1] ==true)
            {

                System.out.println("To Pick 'Four of a Kind', enter 'b' (four of one number)");
            }
            if(p2.Flags[2] == true)
            {

                System.out.println("To Pick 'Yahtzee', enter 'c' (five of one number)");
            }
            if(p2.Flags[3] == true)
            {

                System.out.println("To Pick 'Full House', enter 'd'(two of one number and three of the same or another)");
            }
            if(p2.Flags[4] == true)
            {

                System.out.println("To Pick 'Large Straight', enter 'e' (5 that succeed each other)");
            }
            if(p2.Flags[5] == true)
            {

                System.out.println("To Pick 'Small Straight', enter 'f' (Four numbers that succeed each other)");
            }
            if(p2.Flags[6] == true)
            {

                System.out.println("To Pick 'Chance', enter 'g' (total of all dice)");
            }
            if(p2.Flags[7] == true)
            {

                System.out.println("To Pick 'Ones', enter '1' (Sum of all the 'ones' in your roll)");
            }
            if(p2.Flags[8] == true)
            {

                System.out.println("To Pick 'Twos', enter '2'(Sum of all the 'twos' in your roll)");
            }
            if(p2.Flags[9] == true)
            {

                System.out.println("To Pick 'Threes', enter '3'(Sum of all the 'threes' in your roll)");
            }
            if(p2.Flags[10] == true)
            {

                System.out.println("To Pick 'Fours', enter '4'(Sum of all the 'fours' in your roll)");
            }
            if(p2.Flags[11] == true)
            {

                System.out.println("To Pick 'Fives', enter '5'(Sum of all the 'fives' in your roll)");
            }
            if(p2.Flags[12] == true)
            {

                System.out.println("To Pick 'Sixes', enter '6'(Sum of all the 'sixes' in your roll)");
            }

        }

        //String category = sc.nextLine();
        boolean t = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            boolean FlagsTemp[] = new boolean[13];
            if(counter%2==0.0)
            {
                for(int i=0; i<13; i++){
                    FlagsTemp[i]=p1.Flags[i];
                }
            }
            else 
            {
                for(int i=0; i<13; i++)
                {
                    FlagsTemp[i]=p2.Flags[i];
                }
            }

            String category = br.readLine();
            category = category.replaceAll("\\s+","");
            if(category.equals ("a")==true && FlagsTemp[0]==true )
            {
                if(ones >= 3 || twos >= 3 || threes >= 3 || fours >= 3 || fives>= 3 || sixes >= 3) 
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + getSum();
                        p1.Flags[0] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + getSum();
                        p2.Flags2[0] = false;
                        break;
                    }
                }
                else if(category.equals ("a")==true && FlagsTemp[0]==false )
                {

                }
                else
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + 0;
                        p1.Flags[0] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + 0;
                        p2.Flags2[0] = false;
                        break;
                    }
                }
            }   
            else if(category.equals ("b")==true&& FlagsTemp[1]==true ) 
            { 
                if(ones >= 4 || twos >= 4 || threes >= 4 || fours >= 4 || fives >= 4 || sixes >= 4) 
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + getSum();
                        p1.Flags[1] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + getSum();
                        p2.Flags2[1] = false;
                        break;
                    }
                }
                else
                {
                    if(counter%2==0.0){
                        p1.score = p1.score + 0;
                        p1.Flags[1] = false;
                        break;
                    }
                    else {
                        p2.score = p2.score + 0;
                        p2.Flags2[1] = false;
                        break;
                    }
                }
            }
            else if(category.equals ("c")==true&& FlagsTemp[2]==true  )   
            {
                if(ones == 5 || twos == 5 || threes == 5 || fours == 5 || fives == 5 || sixes == 5) 
                {
                    if(counter%2==0.0){
                        System.out.println("CONGRATS ON THE YAHTZEE! YOU ARE QUITE LUCKY, " + p1.name + "!");
                        p1.score = p1.score + 50;
                        p1.Flags[2] = false;
                        break;
                    }
                    else {
                        System.out.println("CONGRATS ON THE YAHTZEE! YOU ARE EXTREMELY LUCKY, " + p2.name + "!");
                        p2.score = p2.score + 50;
                        p2.Flags2[2] = false;
                        break;
                    }
                }

                else
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + 0;
                        p1.Flags[2] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + 0;
                        p2.Flags2[2] = false;
                        break;
                    }
                }
            }
            else if(category.equals ("d")==true&& FlagsTemp[3]==true ) 
            {
                if((ones == 3 || twos == 3 || threes == 3 || fours == 3 || fives == 3 || sixes == 3)&&(ones == 2 || twos == 2 || threes == 2 || fours == 2 || fives == 2 || sixes == 2)) 
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + 25;
                        p1.Flags[3] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + 25;
                        p2.Flags2[3] = false;
                        break;
                    }
                }

                else
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + 0;
                        p1.Flags[3] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + 0;
                        p2.Flags2[3] = false;
                        break;
                    }
                }
            }   
            else if(category.equals ("e")== true && FlagsTemp[4]==true )
            { 
                if(ones == 1 && twos == 1 && threes == 1 && fours == 1 && fives == 1)
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + 40;
                        p1.Flags[4] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + 40;
                        p2.Flags2[4] = false;
                        break;
                    }
                }
                else if(twos == 1 && threes == 1 && fours == 1 && fives == 1 && sixes == 1) 
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + 40;
                        p1.Flags[4] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + 40;
                        p2.Flags2[4] = false;
                        break;
                    }
                }
                else
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + 0;
                        p1.Flags[4] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + 0;
                        p2.Flags2[4] = false;
                        break;
                    }
                }
            }
            else if(category.equals("f")==true&& FlagsTemp[5]==true ) 
            { 
                if(ones>=1 && twos>=1 && threes>=1 && fours >= 1) 
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + 30;
                        p1.Flags[5] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + 30;
                        p2.Flags2[5] = false;
                        break;
                    }
                }
                else if(twos >= 1 && threes >= 1 && fours >= 1 && fives >= 1) 
                {
                    if(counter%2==0.0){
                        p1.score = p1.score + 30;
                        p1.Flags[5] = false;
                        break;
                    }
                    else {
                        p2.score = p2.score + 30;
                        p2.Flags2[5] = false;
                        break;
                    }
                }
                else if(threes >= 1 && fours >= 1 && fives >= 1 && sixes >= 1) 
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + 30;
                        p1.Flags[5] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + 30;
                        p2.Flags2[5] = false;
                        break;
                    }
                }
                else
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + 0;
                        p1.Flags[5] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + 0;
                        p2.Flags2[5] = false;
                        break;
                    }
                }
            }
            else if(category.equals("g")==true&& FlagsTemp[6]==true )
            {
                if(counter%2==0.0)
                {
                    p1.score = p1.score + getSum();
                    p1.Flags[6] = false;
                    break;
                }
                else
                {
                    p2.score = p2.score + getSum();
                    p2.Flags2[6] = false;
                    break;
                }
            }

            else if(category.equals("1")==true && FlagsTemp[7]==true )
            {

                if(counter%2==0.0)
                {
                    p1.score = p1.score + ones*1;
                    p1.Flags[7] = false;
                    break;
                }
                else 
                {
                    p2.score = p2.score + ones*1;
                    p2.Flags2[7] = false;
                    break;
                }

            }   
            else if(category.equals ("2")==true && FlagsTemp[8]==true )
            {
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + twos*2;
                        p1.Flags[8] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + twos*2;
                        p2.Flags2[8] = false;
                        break;
                    }

                }
            }   
            else if(category.equals ("3")==true&& FlagsTemp[9]==true  )
            {
                if(counter%2==0.0)
                {
                    p1.score = p1.score + threes*3;
                    p1.Flags[9] = false;
                    break;
                }
                else 
                {
                    p2.score = p2.score + threes*3;
                    p2.Flags2[9] = false;
                    break;
                }
            }   
            else if(category.equals ("4")==true && FlagsTemp[10]==true )
            {
                {
                    if(counter%2==0.0)
                    {
                        p1.score = p1.score + fours*4;
                        p1.Flags[10] = false;
                        break;
                    }
                    else 
                    {
                        p2.score = p2.score + fours*4;
                        p2.Flags2[10] = false;
                        break;
                    }
                }
            }   
            else if(category.equals("5")==true&& FlagsTemp[11]==true  )
            {
                if(counter%2==0.0)
                {
                    p1.score = p1.score + fives*5;
                    p1.Flags[11] = false;
                    break;
                }
                else 
                {
                    p2.score = p2.score + fives*5;
                    p2.Flags2[11] = false;
                    break;
                }
            }   
            else if(category.equals("6")==true && FlagsTemp[12]==true )
            {

                if(counter%2==0.0)
                {
                    p1.score = p1.score + sixes*6;
                    p1.Flags[12] = false;
                    break;
                }
                else 
                {
                    p2.score = p2.score + sixes*6;
                    p2.Flags2[12] = false;
                    break;
                }
            } 
            else
            {
                System.out.println("Don't Break the rules! Enter a category you haven't chosen yet.");
            }
        }
        if(counter%2 == 0)
        {
            p1.displayScore();
        }

        else
        {
            p2.displayScore();
        }

    }

    static int getSum()
    {
        int sum =0;
        for (int i = 0; i<5; i++)
        {
            sum = sum + d[i];
        }
        return sum;
    }

    static void displayScore()
    {
        if(counter%2==0.0){
            System.out.print(p1.name + "'s Score is " + p1.score + "!");
        }
        else{
            System.out.println(p2.name + "'s score is "+ p2.score + "!");
        }
    }

    static void printONES()
    {
        System.out.println("---------------");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("|      1      |");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("---------------");
    }

    static void printTWOS()
    {
        System.out.println("---------------");
        System.out.println("|             |");
        System.out.println("|   2         |");
        System.out.println("|         2   |");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("---------------");

    }

    static void printTHREES()
    {
        System.out.println("---------------");
        System.out.println("|             |");
        System.out.println("|   3         |");
        System.out.println("|      3      |");
        System.out.println("|         3   |");
        System.out.println("|             |");
        System.out.println("---------------");

    }

    static void printFOURS()
    {
        System.out.println(" ---------------");
        System.out.println("|  4       4   |");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|  4       4   |");
        System.out.println("|              |");
        System.out.println("----------------");
    }

    static void printFIVES()
    {

        System.out.println(" ---------------");
        System.out.println("|  5       5   |");
        System.out.println("|              |");
        System.out.println("|      5       |");
        System.out.println("|              |");
        System.out.println("|  5       5   |");  
        System.out.println("----------------");

    }

    static void printSIXES()
    {
        System.out.println(" ---------------");
        System.out.println("|  6        6  |");
        System.out.println("|              |");
        System.out.println("|  6        6  |");
        System.out.println("|              |");
        System.out.println("|  6        6  |");
        System.out.println("---------------");
    }

    static void printDICE()
    {
        for(int i = 0;i<5;i++)
        {
            System.out.println("");
            if (d[i]==1){

                System.out.println("Die " + (i+1) + ": ");
                printONES();
            }
            if (d[i]==2){
                System.out.println("Die " + (i+1) + ": "  );
                printTWOS();
            }
            if (d[i]==3)
            {
                System.out.println("Die " + (i+1) + ": "  );
                printTHREES();
            }
            if (d[i]==4)
            {
                System.out.println("Die " + (i+1) + ": " );
                printFOURS();
            }
            if (d[i]==5)
            {
                System.out.println("Die " + (i+1) + ": " );           
                printFIVES();
            }
            if (d[i]==6)
            {
                System.out.println("Die " + (i+1) + ": "  );
                printSIXES();
            }
        }
    }
}

