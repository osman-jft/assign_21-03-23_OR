import java.util.Random;
import java.util.Scanner;

import java.util.Arrays;
public class ReplaceZero {
    public static void main(String[] args) {
        //integer of 10 elts

        int sum = 0;
        int counter = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter nos from 1 to 10 randomly: ");
        int[] arr = new int[10];

        //Taking array of 10 elements as input form user

        while (counter < 10) {
            int num = in.nextInt();
            if(num < 1 || num > 10) System.out.println("Wrong Input: Enter Numbers b/w 1 - 10");
            else {
                arr[counter] = num;
                sum = sum + arr[counter];
                counter++;
            }
        }

        //Print Original Array

        System.out.println(Arrays.toString(arr));

        //Assigning Random Zero To Array

        arr = assignRandomZero(arr);
        System.out.println();

        //Print New Array

        System.out.println(Arrays.toString(arr));
        int sum2 = Arrays.stream(arr).sum();

        //Finding Missing Element

        System.out.println();
        System.out.println("The missing element is "+(sum-sum2));

        }

        //Function to Assign Random Zero into Array
        public static int[] assignRandomZero(int n[]){
            Random random = new Random();
            int randomNumber = random.nextInt(10);
            n[randomNumber] = 0;
            return n;
        }



    }