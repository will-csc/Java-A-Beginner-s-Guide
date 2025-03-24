public class Exercise12_Chapter13 {
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
class Stack<T extends Number, V> implements IGenStack<T, V> {
    private V[] elements;
    private int top; // Índice da pilha

    @SuppressWarnings("unchecked")
    Stack(int size) {
        elements = (V[]) new Object[size]; // Criando array genérico
        top = 0;
    }

    public void push(V data) {
        if (top == elements.length) {
            throw new StackOverflowException("Stack is full! Cannot push " + data);
        }
        elements[top++] = data;
    }

    public V pop() {
        if (top == 0) {
            throw new StackUnderflowException("Stack is empty! Cannot pop.");
        }
        return elements[--top];
    }
}
interface IGenStack<T extends Number, V> {
    void push(V data);
    V pop();
}