import java.io.*;
interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}

class LambdaExceptionDemo {
    public static void main(String args[])
    {
        double[] values = { 1.0, 2.0, 3.0, 4.0 };
        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read(); // could throw IOException
// ...
            return true;
        };
    }
}