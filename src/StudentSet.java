//Define a class named StudentSet,

import java.util.HashSet;

public class StudentSet {

    public static void main(String[] args) {
        //in the main method create an HashSet object,
        HashSet<Student> students = new HashSet<>();

        //add some Student objects to it,

        students.add(new Student("Anant", 20, "Computer Science"));
        students.add(new Student("Gladwin", 22, "Mathematics"));
        students.add(new Student("Mayank", 21, "IT"));

        //display the elements of the set,

        for(Student st: students) {
            st.display();
        }
        System.out.println("");

        Student searchStudent = new Student("Gladwin", 22, "Mathematics");
        if (students.contains(searchStudent)) {
            System.out.println("Student found");
        } else {
            System.out.println("Not found");
        }

    }
    }

    /***6.  Define a class named StudentSet,
     *     in the main method create an HashSet object,
     *     add some Student objects to it,
     *     display the elements of the set,
     *     Search a Student object in the set
     *     (Searching will fail, find out the reason and modify the Student class to enable successful searching).
     */
