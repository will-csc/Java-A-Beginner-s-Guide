public class Err {
    String msg; // error message
    int severity; // code indicating severity of error
    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
