package Java_15;

public class Customer {

    private String id, name;

    public Customer(String i, String n) {
        id = i;
        name = n;
    }

    public String toString() {
        return id + ", " + name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}