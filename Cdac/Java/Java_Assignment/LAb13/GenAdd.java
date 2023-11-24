public class GenAdd {
    public static <T extends Number> double add( T a, T b) {
        double result = a.doubleValue()+b.doubleValue();
        return result;
        
    } public static void main(String[] args) {
        Integer intResult = add(5, 7);
        System.out.println("Integer Result: " + intResult);

        Double doubleResult = add(2.5, 2.7);
        System.out.println("Double Result: " + doubleResult);

        Float floatResult = add(2.2f, 1.1f);
        System.out.println("Float Result: " + floatResult);

        Long longResult = add(100L, 200L);
        System.out.println("Long Result: " + longResult);
    }
}