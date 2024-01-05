package MVC;

import MVC.Controller.StudentController;
import MVC.Model.Database;
import MVC.Model.Student;
import MVC.View.StudentView;

public class MVCPatternDemo {
    public static void main(String[] args) {
        //fetch student record based on his roll no from the database
        Student model = Database.retriveStudentFromDatabase();

        //Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("John");

        controller.updateView();

    }
}
