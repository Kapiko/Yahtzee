
public class Gravity {
      public static double falling(double time, double velo, double g){
        double metres = (velo*time) + (0.5*g*time*time);
        return metres;
    }
}