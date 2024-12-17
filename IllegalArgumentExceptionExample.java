public class IllegalArgumentExceptionExample {
  public static void main(String[] args) {
      try {
          setAge(-5); // Passing an invalid argument
      } catch (IllegalArgumentException e) {
          System.out.println("IllegalArgumentException caught: " + e.getMessage());
      }
  }

  public static void setAge(int age) {
      if (age < 0) {
          throw new IllegalArgumentException("Age cannot be negative.");
      }
  }
}

