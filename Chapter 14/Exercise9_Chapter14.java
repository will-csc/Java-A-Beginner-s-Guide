public class Exercise9_Chapter14 {
    public static void main(String[] args){
        String test = "William Cesar Silva de Carvalho";
        Trim trim = (x) -> {
            String new_string = x.replaceAll(" ","");
            return new_string;
        };
        test = trim.trim(test);

        System.out.println(test);
    }
}
interface Trim{
    String trim(String text);
}
