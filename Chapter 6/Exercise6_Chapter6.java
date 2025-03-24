public class Exercise6_Chapter6 {
    public static void main(String[] args){
        String text = "William";
        printBackwards(text,text.length() - 1);
    }
    public static void printBackwards(String text,int size){
        if(size == -1){ return;}

        System.out.printf("%c",text.charAt(size));
        printBackwards(text,size - 1);
    }
}
