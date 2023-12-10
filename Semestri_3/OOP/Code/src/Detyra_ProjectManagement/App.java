package Detyra_ProjectManagement;

import Detyra_ProjectManagement.Aplication.DesktopAplication;
import Detyra_ProjectManagement.Aplication.MobileAplication;
import Detyra_ProjectManagement.Aplication.Project;
import Detyra_ProjectManagement.Aplication.UebAplication;
import Detyra_ProjectManagement.Enum.Role;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        DesktopAplication project_1 = new DesktopAplication(
                "Project 1",
                "12/12/2023",
                "Windows"
        );

        MobileAplication project_2 = new MobileAplication(
                "Project 2",
                "20/12/2023",
                "Android",
                "1.0"
        );

        UebAplication project_3 = new UebAplication(
                "Project 3",
                "25/12/2023",
                "Java"
        );

        DesktopAplication project_4 = new DesktopAplication(
                "Project 4",
                "30/12/2023",
                "Linux"
        );

        UebAplication project_5 = new UebAplication(
                "Project 5",
                "5/20/2024",
                "PHP|Laravel"
        );

        Project project_7 = new Project(
                "Project 5",
                "12/30/2024"
        );


        ArrayList<Project> uniqueDesign = new ArrayList<Project>();
        uniqueDesign.add(project_1);
        uniqueDesign.add(project_3);
        uniqueDesign.add(project_5);

        ArrayList<Project> complexProject = new ArrayList<Project>();
        complexProject.add(project_5);
        complexProject.add(project_1);
        complexProject.add(project_7);

        Puntori puntori_1 = new Puntori("123237278", Role.PROJECT_MANAGER, project_1);
        Puntori puntori_2 = new Puntori("543576329", Role.PROJECT_MANAGER, project_2);
        Puntori puntori_3 = new Puntori("543576329", Role.PROGRAMMER, complexProject);
        Puntori puntori_4 = new Puntori("543576329", Role.UEB_DESIGNER, uniqueDesign);
        Puntori puntori_5 = new Puntori("543576329", Role.DATABASE_DESIGNER, project_4);

        ArrayList<Puntori> punetoret_1 = new ArrayList<Puntori>();
        punetoret_1.add(puntori_1);
        punetoret_1.add(puntori_4);

        ArrayList<Puntori> punetoret_2 = new ArrayList<Puntori>();
        punetoret_2.add(puntori_2);
        punetoret_2.add(puntori_3);
        punetoret_2.add(puntori_4);

        Firma firma_1 = new Firma("Firma 1", punetoret_1);
        Firma firma_2 = new Firma("Firma 2", punetoret_2);
        System.out.println(firma_1);


    }
}
