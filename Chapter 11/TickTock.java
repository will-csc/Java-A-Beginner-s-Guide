public class TickTock {
    String state;

    synchronized void tick(boolean running){
        if(!running){
            state = "ticked";
            notify();
            return;
        }
        System.out.println("Tick ");

        state = "ticked";

        notify();
        try{
            while(!state.equals("tocked")){
                wait();
            }
        }
        catch (InterruptedException exc){
            System.out.println("Thread interrupted");
        }
    }

    synchronized void tock(boolean running){
        if(!running){
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");

        state = "tocked";

        notify();
        try {
            while(!state.equals("ticked")){
                wait();
            }
        }
        catch (InterruptedException exc){
            System.out.println("Thread interrupted");
        }
    }
}
class ThreadCom {
    public static void main(String args[]) {
        TickTock tt = new TickTock();
        MyThread mt1 = new MyThread("Tick", tt);
        MyThread mt2 = new MyThread("Tock", tt);
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}