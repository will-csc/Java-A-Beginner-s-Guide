public class Exercise3_Chapter6 {
    public static void main(String[] args) {
        Stack pilha = new Stack(10);

        pilha.push('W');
        pilha.push('i');
        pilha.push('l');
        pilha.push('l');

        char poped = pilha.pop();
        System.out.println(poped);
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
