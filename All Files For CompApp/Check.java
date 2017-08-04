class Check{
    boolean checkCategory() {
        String category = sc.next();
        boolean categoryMatch = false;
        if(category >= ONES && category <= SIXES || category == CHANCE) {
            categoryMatch = true;
        }
        else {

            
            ArrayList <Integer> ones = new ArrayList<Integer>();  
            ArrayList <Integer> twos = new ArrayList<Integer>(); 
            ArrayList <Integer> threes = new ArrayList<Integer>(); 
            ArrayList <Integer> fours = new ArrayList<Integer>(); 
            ArrayList <Integer> fives = new ArrayList<Integer>(); 
            ArrayList <Integer> sixes = new ArrayList<Integer>();

           
            for(int i = 0; i < 5; i++) {
                if(dice[i] == 1) {
                    ones.add(1);
                }
                else if(dice[i] == 2) {
                    twos.add(1);
                }
                else if(dice[i] == 3) {
                    threes.add(1);
                }
                else if(dice[i] == 4) {
                    fours.add(1);
                }
                else if(dice[i] == 5) {
                    fives.add(1);
                }
                else if(dice[i] == 6) {
                    sixes.add(1);
                }
            }
            if(category == "THREE_OF_A_KIND") {
                if(ones.size() >= 3 || twos.size() >= 3 || threes.size() >= 3 || fours.size() >= 3 || fives.size() >= 3 || sixes.size() >= 3) {
                    categoryMatch = true;
                }
            }	
            else if(category == "FOUR_OF_A_KIND") { 
                if(ones.size() >= 4 || twos.size() >= 4 || threes.size() >= 4 || fours.size() >= 4 || fives.size() >= 4 || sixes.size() >= 4) {
                    categoryMatch = true;
                }
            }
            else if(category == "YAHTZEE") {
                if(ones.size() == 5 || twos.size() == 5 || threes.size() == 5 || fours.size() == 5 || fives.size() == 5 || sixes.size() == 5) {
                    categoryMatch = true;
                }
            }
            else if(category == "FULL_HOUSE") {
                if(ones.size() == 3 || twos.size() == 3 || threes.size() == 3 || fours.size() == 3 || fives.size() == 3 || sixes.size() == 3) {
                    if(ones.size() == 2 || twos.size() == 2 || threes.size() == 2 || fours.size() == 2 || fives.size() == 2 || sixes.size() == 2) {
                        categoryMatch = true;
                    }
                }
            }	
            else if(category == "LARGE_STRAIGHT") { 
                if(ones.size() == 1 && twos.size() == 1 && threes.size() == 1 && fours.size() == 1 && fives.size() == 1){
                    categoryMatch = true;
                }
                else if(twos.size() == 1 && threes.size() == 1 && fours.size() == 1 && fives.size() == 1 && sixes.size() == 1) {
                    categoryMatch = true;
                }
            }
            else if(category == "SMALL_STRAIGHT") { 
                if(ones.size() >= 1 && twos.size() >= 1 && threes.size() >= 1 && fours.size() >= 1) {
                    categoryMatch = true;
                }
                else if(twos.size() >= 1 && threes.size() >= 1 && fours.size() >= 1 && fives.size() >= 1) {
                    categoryMatch = true;
                }
                else if(threes.size() >= 1 && fours.size() >= 1 && fives.size() >= 1 && sixes.size() >= 1) {
                    categoryMatch = true;
                }
            }
        }
        
    }
}