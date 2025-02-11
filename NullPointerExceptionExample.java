public class NullPointerExceptionExample {
  public static void main(String[] args) {
      try {
          String str = null;
          System.out.println(str.length()); // Accessing a null reference
      } catch (NullPointerException e) {
          System.out.println("NullPointerException caught: Null reference accessed.");
      }
  }
}

