class Bubble {
    public static void main (String [] args){
        int a[]={8,6,2,7,3};
        int tmp;
        
        for (int i=0; i<5; i++){
            for (int j=0; j<5-i-1; j++){
                if (a[j]>a[j+1]){
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        
        for (int i=0; i<5; i++){
            System.out.print(a[i] + " , ");
        }
    }
}