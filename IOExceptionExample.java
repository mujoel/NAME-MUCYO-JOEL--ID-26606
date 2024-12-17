import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
