import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("test.txt"));
            while (true) {
                dis.readByte(); // Reading until EOF
            }
        } catch (EOFException e) {
            System.out.println("EOFException caught: End of file reached.");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}

