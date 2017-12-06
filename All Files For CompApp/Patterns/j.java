package Patterns;

class j{


    public static void main(String[]args) {
        int y = 1;
        int z=1;
        System.out.println("Your Pattern:");

        for ( y = 1; y <= 5 ; y++){
            int k=y; 
            System.out.println("");

            for ( z=1 ; z <= y ; z++){
                
                System.out.print(k);
                
                k--;
            }
        }
    }
}
       