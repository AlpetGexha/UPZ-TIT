package Provimi_Janer_2024;

import java.util.ArrayList;

public class Country {

    public String name;
    public String type;
    public ArrayList<City> cities;

    public Country(String name, String type, ArrayList<City> cities) {
        this.name = name;
        this.type = type;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
}

