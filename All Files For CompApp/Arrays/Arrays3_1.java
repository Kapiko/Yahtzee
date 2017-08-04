package Arrays;

class Arrays3_1 {
    public static void main(String [] args){
       
        String city[]= {"Delhi", "Mumbai", "Chennai", "Kolkata", "Dehradun"};
        double min[]= {12.0, 16.5, 20.2, 18.6, 8.9};
        double max[]= {18.3, 25.8, 30.0, 26.6, 12.2};
       
        for (int i=0; i<5; i++){
            System.out.println("The average rainfall for " + city[i] + " is " + (min[i]+max[i])/2);
        }
       
        double tmax=0.0, tmin=0.0;
        for (int i=0; i<5; i++){
            tmax=tmax+max[i];
            tmin=tmin+min[i];
        }
        System.out.println("The total maximum rainfall is " + tmax);
        System.out.println("The total minimum rainfall is " + tmin);
       
        String name="yolo";
        double ave=0;
        for (int i=0; i<5; i++){
            if (ave<((max[i]+min[i])/2)){
                ave=((max[i]+min[i])/2);
                name=city[i];
            }
        }
        System.out.println("The highest average rainfall is in " + name);
    }
}