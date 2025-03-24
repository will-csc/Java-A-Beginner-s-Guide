public class Exercise10_Chapter2 {
    public static void main(String[] args){
        System.out.println("Prime numbers between 2 and 100");

        for(int i = 2; i < 101; i++){
            if(isprime(i)){
                System.out.printf("'%d' is prime\n",i);
            }
        }
    }
    public static boolean isprime(int n){
        if(n <= 1 || (n % 2 == 0 || n % 3 == 0)){
            return false;
        }
        if(n <= 3){
            return true;
        }

        int i = 5;
        while(i * i <= n){
            if(n % i == 0 || (n % (i + 2)) == 0){
                return false;
            }
            i += 6;
        }
        return true;
    }
}
