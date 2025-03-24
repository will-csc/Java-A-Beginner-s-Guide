public class Exercise2_Chapter7 {
    public static void main(String[] args){
        Circle circle = new Circle(5);
        System.out.printf("Area for circle: %f",circle.area());
    }
}
class Circle extends TwoDShape{
    double pi = Math.PI;
    int ray;

    Circle(int ray){
        this.ray = ray;
    }

    @Override
    double area(){
        return pi * ray;
    }
}
