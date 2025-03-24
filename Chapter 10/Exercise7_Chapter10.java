import java.io.*;

public class Exercise7_Chapter10 {
    public static void main(String[] args) {
        String sourceFile = "helpfile.txt";  // Input file
        String destinationFile = "test.txt";  // Output file

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Open source file for reading
            fis = new FileInputStream(sourceFile);
            // Open destination file for writing
            fos = new FileOutputStream(destinationFile);

            int byteData;
            while ((byteData = fis.read()) != -1) { // Read byte by byte
                // Convert spaces to hyphens
                if (byteData == ' ') {
                    byteData = '-';
                }
                fos.write(byteData); // Write modified byte
            }
            System.out.println("File copied successfully with spaces replaced by hyphens.");

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        } finally {
            // Close files explicitly in finally block to ensure they are closed
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
