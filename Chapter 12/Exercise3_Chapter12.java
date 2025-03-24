public class Exercise3_Chapter12 {
    public static void main(String[] args){
        for(Tools tool : Tools.values()){
            System.out.println(tool);
        }
    }
}
enum Tools{
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}
