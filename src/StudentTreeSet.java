import java.util.TreeSet;

//Define a class named StudentTreeSet,
public class StudentTreeSet {

    public static void main(String[] args) {
        //in the main method create an TreeSet object,
        TreeSet<Student> studentsTS = new TreeSet<>();

        //add some Student objects to it

        studentsTS.add(new Student("Anant", 20, "Computer Science"));
        studentsTS.add(new Student("Gladwin", 22, "Mathematics"));
        studentsTS.add(new Student("Mayank", 21, "IT"));

        for(Student st: studentsTS) {
            st.display();
        }
        System.out.println("");


        Student searchStudent = new Student("Gladwin", 22, "Mathematics");
        if (studentsTS.contains(searchStudent)) {
            System.out.println("Student found");
        } else {
            System.out.println("Not found");
        }




    }
}

/***
 *7. Define a class named StudentTreeSet, in the main method create an TreeSet object,
 * add some Student objects to it (Addition will fail, find out the reason and
 * modify the Student class to enable addition and searching of its objects in a Tree based collection),
 * display the elements of the set, Search a Student object in the set.
 */