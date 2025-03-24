public class Exercise6_Chapter14 {
    public static void main(String[] args){
        MyTest test = (x) -> ( x > 9 && x < 21);
        System.out.println(test.testing(22));
    }
}
interface MyTest{
    boolean testing(int x);
}