public class Exercise4_Chapter6 {
    public static void main(String[] args){
        Test ob1 = new Test(10);
        Test ob2 = new Test(5);
        ob1.swap(ob2);
    }
}
class Test {
    int a;
    Test(int i) { a = i; }

    void swap(Test ob2){
        int temp = this.a;
        this.a = ob2.a;
        ob2.a = temp;
    }
}
