package java_10;

import java.util.ArrayList;

public class Student extends Person {

    private int courseCount = 0;
    private ArrayList<String> course;
    private ArrayList<Integer> grade;


    public Student(String name, String address) {
        super(name, address);
        courseCount = 0;
        course = new ArrayList<String>();
        grade = new ArrayList<Integer>();
    }

    public void setCourse(int count) {
        this.courseCount = count;
    }

}
