public class Exercise10_Chapter6 {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        try {
            stack.push('A');
            stack.push('B');
            stack.push('C');
            //stack.push('D');

            System.out.println(stack.pop()); // C
            System.out.println(stack.pop()); // B
            System.out.println(stack.pop()); // A
            //System.out.println(stack.pop());
        } catch (StackOverflowException | StackUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class StackOverflowException extends RuntimeException{
    public StackOverflowException(String message){
        super(message);
    }
}
class StackUnderflowException extends RuntimeException{
    public StackUnderflowException(String message){
        super(message);
    }
}
class Stack{
    char[] characters;
    int i;

    Stack(int size){
        characters = new char[size];
        i = 0;
    }
    public void push(char data){
        characters[i] = data;
        i++;
    }
    public char pop(){
        char temp = characters[i-1];
        characters[i--] = '\0';
        return temp;
    }
}
