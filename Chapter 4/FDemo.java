public class FDemo implements AutoCloseable {
    int x;
    FDemo(int i) {
        x = i;
    }
    // called when object is recycled
    @Override
    protected void close() {
        System.out.println("Finalizing " + x);
    }
    // generates an object that is immediately destroyed
    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
