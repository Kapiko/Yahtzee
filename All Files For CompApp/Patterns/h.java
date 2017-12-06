package Patterns; 
class h{
    public static void main(String[]args){
        int x = 1;
        for (int y = 1; y<= 5; y++) {
            System.out.println("");
            
            for(int z = 1 ; z<= y; z++) {
                if (x>=10){
                    System.out.print(x + " ");
                    x++;
                }
                
                else{
                System.out.print(x);
                x++;
            }
        }
    }
}
}
