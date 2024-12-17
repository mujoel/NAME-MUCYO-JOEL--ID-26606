public class ArrayIndexOutOfBoundsExceptionExample {
  public static void main(String[] args) {
      try {
          int[] numbers = {1, 2, 3};
          System.out.println(numbers[5]); // Accessing an invalid index
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index accessed.");
      }
  }
}

