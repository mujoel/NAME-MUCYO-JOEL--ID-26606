public class ClassCastExceptionExample {
  public static void main(String[] args) {
      try {
          Object obj = "Hello";
          Integer number = (Integer) obj; // Invalid cast
      } catch (ClassCastException e) {
          System.out.println("ClassCastException caught: Invalid type cast.");
      }
  }
}

