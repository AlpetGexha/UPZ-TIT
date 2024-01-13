package java_10_Trashegimia;

import java.util.ArrayList;

public class Student extends Person {

    private int numCourses;
    private final ArrayList<String> courses;
    private final ArrayList<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public String toString() {
        return "Student: " + super.toString();
    }

    public boolean addCourseGrade(String course, int grade) {
        for (String c : courses) {
            if (c.equals(course))
                return false;
        }
        courses.add(course);
        grades.add(grade);
        numCourses++;
        return true;
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.print(courses.get(i) + ": " + grades.get(i));
            if (i < numCourses - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades)
            sum += grade;
        return (double) sum / numCourses;
    }
}