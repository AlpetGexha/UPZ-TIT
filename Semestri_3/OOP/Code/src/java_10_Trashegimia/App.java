package java_10_Trashegimia;

public class App {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Filan Fisteku", "Rruga B");
        t1.addCourse("Programimi");
        t1.addCourse("ASD");
        t1.addCourse("OOP");
        t1.printCourses();

        System.out.println("Remove course: " + t1.removeCourse("Math"));
        t1.printCourses();
        System.out.println("Remove course: " + t1.removeCourse("OOP"));
        t1.printCourses();

        Student s1 = new Student("Test Testi", "Rruga A");
        System.out.println(s1);

        s1.addCourseGrade("Programimi", 8);
        s1.addCourseGrade("ASD", 8);
        s1.addCourseGrade("OOP", 9);
        s1.printGrades();

        System.out.println("Average grade: " + s1.getAverageGrade());
        s1.setAddress("Rruga C");

        System.out.println(s1);
    }
}