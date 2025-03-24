public class WeightMoon {
    public static void main(String[] args) {
        double weight_earth = 90; //kg
        double divisor = 9.81;
        double multiplier = 1.622;

        double weight_moon = (weight_earth / divisor) * multiplier;
        System.out.println("Weight on moon: "+weight_moon);
    }
}
