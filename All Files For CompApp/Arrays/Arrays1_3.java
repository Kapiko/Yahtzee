package Arrays;

class Arrays1_3 {
    public static void main(String [] args){
        double x[]= {1.2,3,6.3,7.4,9.5,2.4,1.1,4.5,8.6,1.2};
        double sum=0;
        for (int i=0; i<10; i++){
            sum=sum+x[i];
        }
        System.out.println("The sum is "+sum);
    }
}