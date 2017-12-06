package ProjectYahtzee10D;
class User{

    String name;
    int score;
    Scanner sc = new Scanner(System.in);
    void roll(){

        int f = sc.nextInt(); //How many dice the guy wants to roll
        if (f > rolled.length){
            System.out.println("Please enter a number less than or equal to the amount of dice available");
            f = sc.nextInt();
        }
        for(int i = 0;i<f;i++){
            int d = ( ((int) (Math.random() * (7 - 1))) + 1); //One die being rolled
            System.out.println(d); //Result being shown
            rolled[i] = d;       //Storing the values of d1 in the "Rolled"  array

        } 
    }

    void select(){
        System.out.println("Do you want to select dice? (Enter YES or NO)");
        String st = sc.next();
        if (st = YES){

            System.out.println("Enter how many dice you want to select");
            int e = sc.nextInt();
            System.out.println("Enter which dice you want to select");
            for(int r = 0; r = (e-1); r++){
                int y = sc.nextInt();
                selected[r] = rolled[y];
                rolled[y] = null;
            }
        }
        else if(st = NO){

        }
    }

    void arrange(){

        int n = selected.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(selected[j-1] > selected[j]){  
                    //swap elements  
                    temp = selected[j-1];  
                    selected[j-1] = selected[j];  
                    selected[j] = temp;  
                }
            }
        }
    }
}

