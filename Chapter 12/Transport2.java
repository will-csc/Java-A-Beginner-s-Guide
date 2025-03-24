public enum Transport2 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed; // typical speed of each transport
    // Constructor
    Transport2(int s) { speed = s; }
    public int getSpeed() { return speed; }
}
class EnumDemo3 {
    public static void main(String args[])
    {
        Transport tp;
// Display speed of an airplane.
        System.out.println("Typical speed for an airplane is " +
                Transport2.AIRPLANE.getSpeed() +
                " miles per hour.\n");
        // Display all Transports and speeds.
        System.out.println("All Transport speeds: ");
        for(Transport2 t : Transport2.values())
            System.out.println(t + " typical speed is " +
                    t.getSpeed() +
                    " miles per hour.");
    }
}

