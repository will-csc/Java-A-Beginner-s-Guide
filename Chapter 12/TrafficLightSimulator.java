public class TrafficLightSimulator {
    private Thread thrd; // holds the thread that runs the simulation
    private TrafficLightColor tlc; // holds the traffic light color
    boolean stop = false; // set to true to stop the simulation
    boolean changed = false; // true when the light has changed
    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
        thrd = new Thread();
        thrd.start();
    }
    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
        thrd = new Thread();
        thrd.start();
    }
    public void run() {
        while(!stop) {
            try {
                switch(tlc) {
                    case GREEN:
                        Thread.sleep(10000); // green for 10 seconds
                        break;
                    case YELLOW:
                        Thread.sleep(2000); // yellow for 2 seconds
                        break;
                    case RED:
                        Thread.sleep(12000); // red for 12 seconds
                        break;
                }
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }
    synchronized void changeColor() {
        switch(tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify(); // signal that the light has changed
    }
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait(); // wait for light to change
            changed = false;
        } catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }
    synchronized TrafficLightColor getColor() {
        return tlc;
    }
    synchronized void cancel() {
        stop = true;
    }
}
