public class SwapNumbersMul {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // swap the numbers without using a third variable
        a = a * b;
        b = a / b;
        a = a / b;

      //  a = a * b / (b = a);

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
