package Arrays;

class Arrays1_2 {
    public static void main(String [] args){
        int x[]= {5,2,78,2,4,12,74,6,78,1};
        int max=x[0], min=x[0];
        for(int i=0; i<10; i++){
            if (max<x[i])
                max=x[i];
            if (min>x[i])
                min=x[i];
            }
            System.out.println("Min is " + min + "   Max is " + max);
        }
    }       
                
            
            