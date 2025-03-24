public class Exercise12_Chapter11 {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }
}
class Queue {
    private int item;
    private boolean hasItem = false; // Flag to check if item is available

    // Synchronized method for producing an item
    public synchronized void put(int item) {
        while (hasItem) {
            try {
                wait(); // Wait if the queue is full
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        this.item = item;
        hasItem = true;
        System.out.println("Produced: " + item);
        notify(); // Notify waiting consumers
    }

    // Synchronized method for consuming an item
    public synchronized int get() {
        while (!hasItem) {
            try {
                wait(); // Wait if the queue is empty
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        hasItem = false;
        System.out.println("Consumed: " + item);
        notify(); // Notify waiting producers
        return item;
    }
}
class Producer extends Thread {
    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            queue.put(i);
            try {
                Thread.sleep(500); // Simulating time-consuming production
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            queue.get();
            try {
                Thread.sleep(1000); // Simulating time-consuming consumption
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
