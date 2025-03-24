public class Exercise8_Chapter14 {
    public static void main(String[] args){
        MyFunc2<Integer> doubleNumber = (x) -> { return x * 2; };
        System.out.println(doubleNumber.func(10));
    }
}
interface MyFunc2<T>{
    T func(T x);
}
