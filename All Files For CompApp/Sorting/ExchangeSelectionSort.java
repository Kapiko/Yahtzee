package Sorting;
class ExchangeSelectionSort {

    public static void main (String[] args) {

        int a[] = {5,3,8,4,9,2,1,12,90,15};
        int tmp =0, small=0, pos =0;

        for (int i =0 ; i <a.length; i++) {
            small = a[i];
            pos = i;
            for (int j = i+1; j< a.length; j++) {
                if (a[j] < small) { 
                    small = a[j];
                    pos = j;
                }
            }

            tmp = a[i];
            a [i] = small;
            a [pos] = tmp;
        }

        System.out.print("the sorted array is ");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
//KoolKompKidz
