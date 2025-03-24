public class AddMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        int range1, range2;

        System.out.print("Minivan can carry " + minivan.passengers +
                ". ");
        minivan.range(); // display range of minivan
        System.out.print("Sportscar can carry " + sportscar.passengers +
                ". ");
        sportscar.range(); // display range of sportscar.
    }
}
