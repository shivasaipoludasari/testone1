 public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening Conversion)
        int intValue = 10;
        double doubleValue = intValue; // Implicit casting from int to double
        System.out.println("Implicit casting: int to double - Result: " + doubleValue);

        // Explicit Type Casting (Narrowing Conversion)
        double anotherDoubleValue = 3.14;
        int anotherIntValue = (int) anotherDoubleValue; // Explicit casting from double to int
        System.out.println("Explicit casting: double to int - Result: " + anotherIntValue);
    }
}
