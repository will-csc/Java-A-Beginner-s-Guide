interface Series {
    int getNext(); // return next number in series
    void reset(); // restart
    void setStart(int x); // set starting value
}
public class ByTwos implements Series{
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }
    public int getNext() {
        val += 2;
        return val;
    }
    public void reset() {
        val = start;
    }
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
class ByThrees implements Series {
    int start;
    int val;
    ByThrees() {
        start = 0;
        val = 0;
    }
    public int getNext() {
        val += 3;
        return val;
    }
    public void reset() {
        val = start;
    }
    public void setStart(int x) {
        start = x;
        val = x;
    }
}