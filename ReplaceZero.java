import java.util.Random;
import java.util.Arrays;
public class ReplaceZero {
    public static void main(String[] args) {
        //integer of 10 elts
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        arr = arrSwap(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //System.out.println(arr.toString());
        int zeroElt = 0;
        int[] arr2 = new int[10];
        //arr2 = arrSwap(arr);
        for (int j = 0; j < arr.length; j++) arr2[j] = arr[j];
        //arr2 = arr;
        arr2 = assignRandomZero(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
            if (arr2[i] == 0)
                zeroElt = i;
            }
        int b = zeroElt+1;
        System.out.println();
        System.out.println("Element no: "+b+" is Zero");
        System.out.println("Its value is "+ arr[zeroElt]);
        }
        public static int[] arrSwap(int m[]){
            //int[] array = { 1, 2, 3, 4, 5, 6, 7 };

            Random rand = new Random();

            for (int i = 0; i < 10; i++) {
                int randomIndexToSwap = rand.nextInt(10);
                int temp = m[randomIndexToSwap];
                m[randomIndexToSwap] = m[i];
                m[i] = temp;
                //System.out.print(i+ " ");
            }
            //System.out.println();
            return m;
        }
        public static int[] assignRandomZero(int n[]){
            Random random = new Random();
            int randomNumber = random.nextInt(10);
            n[randomNumber] = 0;
            return n;
        }


    }