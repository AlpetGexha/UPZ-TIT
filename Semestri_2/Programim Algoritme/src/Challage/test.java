package Challage;

public class test {

//    builder Pattern
    public String pizza = "";

    public test(String pizza) {
        this.pizza = pizza;
    }

    public test add(String topping) {
        pizza += topping + " ";
        return this;
    }

    public test addAt(String topping, int index) {
        pizza += topping  + " ";
        return this;
    }

    public test patato(){
        pizza += "Patatot ";
        return this;
    }

    public test cheese(){
        pizza += "Cheese ";
        return this;
    }

    public test tomato(){
        pizza += "Tomato ";
        return this;
    }

    public void display() {
        System.out.println(pizza);
    }

    public static void main(String[] args) {


        // [1 ,2 ,3 123,324,534, 654,765, 867,3999 ,654654 ] // n

        test pizza = new test("Pizza: ");

        pizza.add("Mushroom")
                .add("Pepperoni")
                .add("Bacon")
                .addAt("Onion", 3)
                .addAt("Olives", 0)
                .addAt("Olives",2)
                .tomato()
                .addAt("Sausage", 6)
                .patato()
                .cheese()
                .addAt("Peppers", 5);

        pizza.display();
    }
}
