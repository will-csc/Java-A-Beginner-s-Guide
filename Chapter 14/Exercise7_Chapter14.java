public class Exercise7_Chapter14 {
    public static void main(String[] args){
        NumericFunc2 Factorial = (x) -> {
            int number = x;
            for(int i = x - 1; i > 0; i--){
                number *= i;
            }
            return number;
        };
        System.out.println("Fatorial de 5: " + Factorial.factorial(5)); // 120
        System.out.println("Fatorial de 7: " + Factorial.factorial(7)); // 5040
        System.out.println("Fatorial de 10: " + Factorial.factorial(10)); // 3628800

    }
}
interface NumericFunc2{
    int factorial(int x);
}