public class ClassNotFoundExceptionExample {
  public static void main(String[] args) {
      try {
          // Attempt to load a class that doesn't exist
          Class.forName("com.example.NonExistentClass");
      } catch (ClassNotFoundException e) {
          System.out.println("ClassNotFoundException caught: " + e.getMessage());
      }
  }
}

