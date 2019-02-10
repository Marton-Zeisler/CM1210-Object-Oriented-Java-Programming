public class FloatingPointTest{
    public static void main(String[] args) {
        float number1 = 1.36f;
        double number2 = 1.36;

        System.err.println(number1 == number2);

        float number3 = 0.1f;
        number3 += 0.6f;
        System.out.println(number3);

        float number4 = 1 / 49;
        number4 *= 49;
        System.err.println(number4);

        double number5 = 1 / 49;
        number5 *= 49;
        System.err.println(number5);
    }
}