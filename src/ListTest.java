//Define a class named ListTest,

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {

        // in the main method create an ArrayList object,

        ArrayList<String> list = new ArrayList<String>();

      // add some strings to it,
        list.add("Hello");
        list.add("I");
        list.add("am");
        list.add("Osman");


       // String elt = list.get(3);
      //  System.out.println("The element is: " + elt);
     //   list.remove(0);

       // insert some strings at specified positions
        list.add(4, "Rabbani");
        list.add(5, "I");
        list.add(6, "Like");
        list.add(7, "Programming");

        //display the elements of the list,
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println(" ");
// Search an element in the list and ****
        String elt = "Rabbani";

        for (int i = 0; i< list.size(); i++)  {
            if (list.get(i) == elt)
                // remove an element from the list
                list.remove(i);
            System.out.print(list.get(i) + " ");
        }

        //another way

        if (list.contains("Hello")) list.remove("Hello");

        System.out.println(" ");

        System.out.println(list.toString()+ " ");


    }
}


/**
 *1. Define a class named ListTest,
 * in the main method create an ArrayList object,
 * add some strings to it, insert some strings at specified positions, display the elements of the list,
 * Search an element in the list and remove an element from the list.
 **/
