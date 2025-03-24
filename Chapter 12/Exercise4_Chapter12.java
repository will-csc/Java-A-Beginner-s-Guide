enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);

    private final int delay;

    TrafficLightColor(int delay) {
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }
}
class TrafficLightSimulator implements Runnable {
    private Thread thrd; // holds the thread that runs the simulation
    private TrafficLightColor tlc; // holds the traffic light color
    boolean stop = false; // set to true to stop the simulation
    boolean changed = false; // true when the light has changed

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator() {
        this(TrafficLightColor.RED);
    }

    // Start up the light.
    public void run() {
        while (!stop) {
            try {
                Thread.sleep(tlc.getDelay());
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }
    synchronized void changeColor() {
        tlc = TrafficLightColor.values()[(tlc.ordinal() + 1) % TrafficLightColor.values().length];
        changed = true;
        notify();
    }

    // Wait until a light change occurs.
        synchronized void waitForChange () {
            try {
                while (!changed)
                    wait(); // wait for light to change
                changed = false;
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }
// Return current color.
        synchronized TrafficLightColor getColor () {
            return tlc;
        }
// Stop the traffic light.
        synchronized void cancel () {
            stop = true;
        }
    }

    class TrafficLightDemo {
        public static void main(String args[]) {
            TrafficLightSimulator tl =
                    new TrafficLightSimulator(TrafficLightColor.GREEN);
            for (int i = 0; i < 9; i++) {
                System.out.println(tl.getColor());
                tl.waitForChange();
            }
            tl.cancel();
        }
    }

