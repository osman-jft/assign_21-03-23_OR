import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
               name.equals(student.name) &&
                course.equals(student.course);

    }

    @Override
    public int hashCode(){
        return this.age + this.name.hashCode() + this.course.hashCode();
    }


    public int compareTo(Student that) {
        if(!this.equals(that))
            return (this.name.compareToIgnoreCase(that.name));
        return 0;
    }
}

/***
 * 4. Create a class named Student, which has name, age, course as data members, constructors and a display method.
 */






/*
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    } */