import java.util.HashSet;
import java.util.TreeSet;
//Define a class named SetTest,
public class SetTest {

    public static void main(String[] args) {
        //in the main method create a HashSet object,
        HashSet<String> set = new HashSet<>();

        // add some strings to it
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("pear");

        //display them,
        for (String element : set) {
            System.out.println(element);
        }
        // create a TreeSet and all the elements of the hashset to it
        TreeSet<String> treeSet = new TreeSet<>(set);

        //create a TreeSet and all the elements of the hashset to it

        System.out.println("\n" +
                "TreeSet Print" +
                "\n");

        for (String element : treeSet) {
            System.out.println(element);
        }

        TreeSet<String> t2 = new TreeSet<>();

        t2.addAll(set);

        System.out.println("\n" +
                "TreeSet Print #2" +
                "\n");

        for (String element : treeSet) {
            System.out.println(element);
        }



    }
}

/**
 2. Define a class named SetTest, in the main method create a HashSet object,
 add some strings to it, display them, create a TreeSet and all the elements of the hashset to it and
 display the elements of the TreeSet.

 **/