public class GenAdd {
  public static <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    public static void main(String[] args) {
        System.out.println(add(5, 3)); // Expected: 8
        System.out.println(add(5.5, 3.3)); // Expected: 8.5
        System.out.println(add(2.8f, 1.1f));
        System.out.println(add(100L, 200L));
    }

  
}