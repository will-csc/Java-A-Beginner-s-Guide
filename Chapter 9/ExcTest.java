public class ExcTest {
    static void genException() {
        int nums[] = new int[4];
        System.out.println("Before exception is generated.");
// generate an index out-of-bounds exception
        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}
class ExcDemo2 {
    public static void main(String args[]) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
// catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
