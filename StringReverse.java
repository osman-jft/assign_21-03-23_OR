public class StringReverse {

    public static void main(String[] args) {
        String input = "hello world";

        // Reversing using String class methods
        String reversed1 = reverseUsingStringMethods(input);
        System.out.println("Reversed using String methods: " + reversed1);

        // Reversing using custom method
        String reversed2 = reverseUsingCustomMethod(input);
        System.out.println("Reversed using custom method: " + reversed2);
    }

    public static String reverseUsingStringMethods(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseUsingCustomMethod(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}

