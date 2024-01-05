package MVC.Model;

import MVC.Enum.Gender;

public class Database {

    public static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        student.setGender(Gender.male);
        return student;
    }
}
