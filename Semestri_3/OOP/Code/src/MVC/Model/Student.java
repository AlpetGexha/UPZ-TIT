package MVC.Model;

import MVC.Enum.Gender;

public class Student {
    private String name;
    private Gender gender;
    private String rollNo;

    public Student(String name, Gender gender, String rollNo) {
        this.name = name;
        this.gender = gender;
        this.rollNo = rollNo;
    }

    public Student() {
        this.name = "";
        this.rollNo = "";
        this.gender = null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
