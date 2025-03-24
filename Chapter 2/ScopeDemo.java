public class ScopeDemo {
    public static void main(String[] args){
        int x;

        x = 10;
        if(x == 10){
            int y = 20; // known only to this block

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error! y not known here
        System.out.println("x is " + x);
    }
}
