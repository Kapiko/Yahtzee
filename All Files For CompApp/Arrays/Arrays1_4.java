package Arrays;

class Arrays1_4 {
    public static void main(String [] args){
        float x[]={1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f,10.0f};
        float sum=0;
        for (int i=0; i<10; i++){
            sum=sum+x[i];
        }
        float av = sum/10;
        System.out.println("The average is "+av);
    }
}
