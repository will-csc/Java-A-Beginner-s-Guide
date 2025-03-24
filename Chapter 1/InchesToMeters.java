public class InchesToMeters {
    public static void main(String[] args) {
        int counter = 0;

        for int inches = 1; inches <= 100; inches++) {
            double meters = inches * 0.0254;
            System.out.printf("%3d inches = %.4f meters%n", inches, meters);

            if (inches % 10 == 0) {
                System.out.println(); // Insere uma linha em branco a cada 10 linhas
            }
        }
    }
}
