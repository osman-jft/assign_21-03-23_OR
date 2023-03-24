/***************
 Q6.
 Define a class which has a main method---- (check),
 It creates an integer array of 10 elements---- (check)
 Initializes it by values from 1 to 10---- (check)
 Replace a random element value by 0-----  (check)


 **********************
 Your method should identify and display the missing element ( which is replaced by zero).
 ***********/


import java.util.Random;
public class ReplaceZero {
    public static void main(String[] args) {
        //integer of 10 elts
//create array,
        int sum = 0;
        int[] arr = {10,9,8,7,6,4,5,3,2,1};
        //int[] two = new int[2];
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        arr[randomNumber] = 0;
        System.out.println("New array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
        }
        System.out.println(" ");
        System.out.println("Missing element is : " + missingElement(sum) + "\n" + "At index no "+(randomNumber+1));
    }


    public static int missingElement(int s){
        int missingElt = 55 - s;
        return missingElt;
    }
}
