import java.io.*;
import java.util.*;
class YAHTZEE{
    static Scanner sc = new Scanner(System.in);
    static int d[] = new int[5];
    static int score =0;
    static String name;
    static boolean Flags[] = {true, true, true, true, true, true, true, true, true, true, true, true, true};
    static YAHTZEE p1 = new YAHTZEE();


    public static void main(String[]args)throws IOException {
        
        p1.enterName();
        for(int i =0;i<14;i++){
        p1.PlayRound();
    }

    }
    
    static void enterName(){
        System.out.println("Enter your player's name");
        name = sc.nextLine();
    }


    static void secondAndThirdRoll()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which dice so you want to re-roll?");
        String g  ="";
        for(int i=0;i<5;i++){
            System.out.println("Do you want to re-roll Dice Number " + (i+1) +" ? (YES or NO)");
            g = sc.next();

            if( g.equals("YES") == true){

                d[i] = ( ((int) (Math.random() * (7 - 1))) + 1);
            }
            else if(g.equals("NO") == true){
                d[i] = d[i];
            }

        }

        int f = 5;
        for(int i = 0;i<f;i++)
        {

            System.out.println("Die " + (i+1) + ": " + d[i]);
        }
    }

  
    static void PlayRound()throws IOException{
        int f = 5;
        for(int i = 0;i<f;i++)
        {
            d[i] = ( ((int) (Math.random() * (7 - 1))) + 1);
            System.out.println("Die " + (i+1) + ": " + d[i]);
        }

        for(int i =0; i<2;i++){
            System.out.println("Do you want to re-roll?");
            String g = "";
            g = sc.next();

            if( g.equals("YES") == true){

                secondAndThirdRoll();
            }
            else if(g.equals("NO") == true){
                break;
            }

        }

        int ones = 0;
        int twos =  0;
        int threes = 0;
        int fours = 0;
        int fives = 0; 
        int sixes = 0;

        for(int i = 0; i < 5; i++) {
            if(d[i] == 1) {
                ones = ones + 1;
            }
            else if(d[i] == 2) {
                twos = twos + 1;
            }
            else if(d[i] == 3) {
                threes = threes + 1;
            }
            else if(d[i] == 4) {
                fours = fours + 1;
            }
            else if(d[i] == 5) {
                fives = fives + 1;
            }
            else if(d[i] == 6) {
                sixes = sixes + 1;
            }
        }

        System.out.println("Enter the category you want to choose");
        //String category = sc.nextLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String category = br.readLine();
        int dummy = 0;
        if(category.contains ("THREE_OF_A_KIND")==true ){
            if(ones >= 3 || twos >= 3 || threes >= 3 || fours >= 3 || fives>= 3 || sixes >= 3) {
                
                score = getSum(dummy);
                Flags[0] = false;
            }
            else{
                score = score+0;
                Flags[0] = false;
            }
        }   
        else if(category.contains ("FOUR_OF_A_KIND")==true) { 
            if(ones >= 4 || twos >= 4 || threes >= 4 || fours >= 4 || fives >= 4 || sixes >= 4) {

                score = getSum(dummy);
                Flags[1] = false;
            }
            else{
                score = score+0;
                Flags[1] = false;
            }
        }
        else if(category.contains ("YAHTZEE")==true ){
            if(ones == 5 || twos == 5 || threes == 5 || fours == 5 || fives == 5 || sixes == 5) {

                score = 50;
                Flags[2] = false;
            }
            else{
                score = score+0;
                 Flags[2] = false;
            }
        }
        else if(category.contains ("FULL_HOUSE")==true) {
            if(ones == 3 || twos == 3 || threes == 3 || fours == 3 || fives == 3 || sixes == 3) {
                score = getSum(dummy);
                Flags[3] = false;
                
            }
            else if(ones == 2 || twos == 2 || threes == 2 || fours == 2 || fives == 2 || sixes == 2) {

                score = getSum(dummy);
                Flags[3] = false;
            }
            else{
                score = score+0;
                Flags[3] = false;
            }
        }   
        else if(category.contains ("LARGE_STRAIGHT")== true ){ 
            if(ones == 1 && twos == 1 && threes == 1 && fours == 1 && fives == 1){
                score = score + 40;
                Flags[4] = false;
            }
            else if(twos == 1 && threes == 1 && fours == 1 && fives == 1 && sixes == 1) {
               score = score + 40;
               Flags[4] = false;
            }
            else{
                score = score+0;
                Flags[4] = false;
            }
        }
        else if(category.contains ("SMALL_STRAIGHT")==true) { 
            if(ones>=1 && twos>=1 && threes>=1 && fours >= 1) {
                score = score + 30;
                Flags[5] = false;
            }
            else if(twos >= 1 && threes >= 1 && fours >= 1 && fives >= 1) {
                score = score + 30;
                Flags[5] = false;
            }
            else if(threes >= 1 && fours >= 1 && fives >= 1 && sixes >= 1) {
                score = score+30;
                Flags[5] = false;
            }
            else{
                score = score+0;
                Flags[5] = false;
            }
        }
        else if(category.contains ("CHANCE")==true){
           score = getSum(dummy);
           Flags[6] = false;
        }
        
        else if(category.contains ("ONES")==true ){
            {

                score = score + ones;
                Flags[7] = false;
            }
        }   
        else if(category.contains ("TWOS")==true ){
            {

                score = score + twos*2;
                Flags[8] = false;
            }
        }   
        else if(category.contains ("THREES")==true ){
            {

                score = score + threes*3;
                Flags[9] = false;
            }
        }   
        else if(category.contains ("FOURS")==true ){
            {

                score = score + fours*4;
                Flags[10] = false;
            }
        }   
        else if(category.contains ("FIVES")==true ){
            {

                score = score + fives*5;
                Flags[11] = false;
            }
        }   
        else if(category.contains ("SIXES")==true ){
            {

                score = score + sixes*6;
                Flags[12] = false;
            }
        }   

        p1.displayScore();
    }
    static int getSum(int sum){

        for (int i = 0; i<5; i++){
            sum = sum + d[i];
        }
        return sum;
    }
    static void displayScore(){
        System.out.println("Your Score is " + score + "!");
    }
}
//pepe