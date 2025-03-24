public class Exercise13_Chapter6 {
    public static void main(String[] args){
        sum(10,20,20);
        sum(10,20,20,50);
    }
    public static void sum(int ...args){
        int sum = 0;
        for(int value: args){
            sum +=  value;
        }
        System.out.printf("The sum is: %d\n",sum);
    }
}
