public class NumberFormatExceptionExample {
  public static void main(String[] args) {
      try {
          String invalidNumber = "abc";
          int num = Integer.parseInt(invalidNumber); // Invalid number format
      } catch (NumberFormatException e) {
          System.out.println("NumberFormatException caught: Invalid number format.");
      }
  }
}
