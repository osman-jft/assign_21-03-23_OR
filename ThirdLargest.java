public class ThirdLargest {

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};
        int n = arr.length;
        int thirdLargest = findThirdLargest(arr, n);
        System.out.println("The third largest element is " + thirdLargest);
    }

    public static int findThirdLargest(int[] arr, int n) {
        int firstLargest = arr[0];
        int secondLargest = 0; //Integer.MIN_VALUE;
        int thirdLargest = 0; //Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }

        return thirdLargest;
    }
}
