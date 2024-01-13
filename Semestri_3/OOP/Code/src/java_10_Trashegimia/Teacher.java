package java_10_Trashegimia;

import java.util.ArrayList;

public class Teacher extends Person {

    private int numCourses;
    private final ArrayList<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new ArrayList<>();
    }

    public String toString() {
        return "Teacher: " + super.toString();
    }

    public boolean addCourse(String course) {
        for (String c : courses) {
            if (c.equals(course))
                return false;
        }
        courses.add(course);
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        for (String c : courses) {
            if (c.equals(course)) {
                courses.remove(course);
                numCourses = numCourses - 1;
                return true;
            }
        }
        return false;
    }

    public void printCourses() {
        System.out.println(courses);
    }
}