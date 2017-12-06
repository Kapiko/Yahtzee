package Patterns;
class s{
    public static void main(String[]args){

        for (int y = 1; y<=5 ; y++) {
            System.out.println("");
            
            for(int z = 1 ; z<=y ; z++) {
                if (z%2==0){
                    System.out.print(0);
                }
               else {
                   System.out.print(1);
                
                }
            }
        }
    }
}
