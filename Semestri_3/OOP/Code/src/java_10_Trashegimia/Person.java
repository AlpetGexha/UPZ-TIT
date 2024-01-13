package java_10_Trashegimia;

public class Person {

    private final String name;
    private String address;

    public Person(String n, String a) {
        name = n;
        address = a;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String toString() {
        return name + "(" + address + ")";
    }
}