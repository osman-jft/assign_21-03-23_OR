import java.util.ArrayList;

public class StudentList {
    // create an ArrayList object to store Student objects

    public static void main(String[] args) {

        // in the main method create an ArrayList object,

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Anant", 20, "Computer Science"));
        students.add(new Student("Gladwin", 22, "Mathematics"));
        students.add(new Student("Mayank", 21, "IT"));

        // display the elements of the list
        for (Student s : students) {
            s.display();
            System.out.println();
        }

        Student searchStudent = new Student("Gladwin", 22, "Mathematics");
        if (students.contains(searchStudent)) {
            System.out.println("Student found");
        } else {
            System.out.println("Not found");
        }


    }
}
