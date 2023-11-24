public class GenericAddition {

    public static <T extends Number> T add(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }

    public static void main(String[] args) {
        Integer intResult = add(5, 10);
        Double doubleResult = add(3.5, 2.5);
        Float floatResult = add(2.0f, 1.5f);
        Long longResult = add(1000L, 500L);

        System.out.println("Integer Result: " + intResult);
        System.out.println("Double Result: " + doubleResult);
        System.out.println("Float Result: " + floatResult);
        System.out.println("Long Result: " + longResult);
    }
}
