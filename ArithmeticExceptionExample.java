public class ArithmeticExceptionExample {
  public static void main(String[] args) {
      try {
          int result = 10 / 0; // Division by zero
      } catch (ArithmeticException e) {
          System.out.println("ArithmeticException caught: Division by zero is not allowed.");
      }
  }
}

