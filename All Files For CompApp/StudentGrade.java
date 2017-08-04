import java. util.Scanner;

    class StudentGrade {
      
    public static void main(String[] srgs) {
        int n;
        Scanner c = new Scanner (System.in);
        
        System.out.println("Please enter your mark less than or equal to 100");
        n = c.nextInt();
        
        if ( n >= 90)
        System. out.println ("Your grade is A");
        else if (n > 80)     

        
        System. out.println("Your grade is B");
        
        else if  (n >= 70)
        
        System. out.println("Your grade is C");
        
        else if  (n >= 60)
        
        System. out.println("Your grade is D");
       
        else if  (n >= 50)
        
        System. out.println("Your grade is E");
        
        else System. out.println("You have failed :(");
        
    }
}
       
        