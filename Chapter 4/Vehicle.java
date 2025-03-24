public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return (fuelcap * mpg);
    }
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
}
class CompFuel {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(1,1,1);
        Vehicle sportscar = new Vehicle(1,1,1);
        double gallons;
        int dist = 252;
// assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
// assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " +
                gallons + " gallons of fuel.");
        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " +
                gallons + " gallons of fuel.");
    }
}
