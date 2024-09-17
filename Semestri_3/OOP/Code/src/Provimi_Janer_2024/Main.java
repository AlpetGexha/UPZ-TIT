package Provimi_Janer_2024;

import Detyra.ProjectManagement.Puntori;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Employee puntori_1 = new Employee("Punotori 1", 25, 1234);
        Employee puntori_2 = new Employee("Punotori 2", 30, 1235);
        Employee puntori_3 = new Employee("Punotori 3", 35, 1236);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(puntori_1);
        employees.add(puntori_2);
        employees.add(puntori_3);


        President president_1 = new President("Presidenti", 50, 10, "Dr");

        NenPresident nenpresident_1 = new NenPresident("NenPresidenti 1", 45, 5, "Phd");
        NenPresident nenpresident_2 = new NenPresident("NenPresidenti 2", 40, 3, "Dr");

        ArrayList<NenPresident> nenpresidents = new ArrayList<>();
        nenpresidents.add(nenpresident_1);
        nenpresidents.add(nenpresident_2);

        Komuna komuna = new Komuna(president_1, nenpresidents, employees);

        City city_1 = new City("Malishava", 200000, true, komuna);
        City city_2 = new City("Vushtria", 100000, false, komuna);

        ArrayList<City> cities = new ArrayList<>();
        cities.add(city_1);
        cities.add(city_2);

        Country country = new Country("Kosova", "Republike", cities);

    }

}
