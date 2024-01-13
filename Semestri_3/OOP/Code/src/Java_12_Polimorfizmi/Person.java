package Java_12_Polimorfizmi;

public class Person {

    protected String name;
    protected char gender;
    protected Date birthday;

    public Person(String n, char g, Date b) {
        name = n;
        gender = g;
        birthday = b;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String toString() {
        return name + ", " + gender + ", " + birthday;
    }
}