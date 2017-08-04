package Arrays;

class Arrays4_3{
    public static void main (String [] args){
        int x[] = {5, -3, -2, 1, 0, 12, 14, 16};
        int y[] = {6, 5, 10, 15, 18, 20, 22, 30};
        int z[]= new int[16];
        int p=0;
        for (int i=0; i<8; i++){
            z[i]=x[p];
            p++;
        }
        p=0;
        for (int i=8; i<16; i++){
            z[i]=y[p];
            p++;
        }
        
        for (int i=0; i<16; i++){
            System.out.println(z[i]);
        }
    }
}
