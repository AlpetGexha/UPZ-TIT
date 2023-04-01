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
        test pizza = new test("Pizza: ");

        pizza.add("Mushroom")
                .add("Pepperoni")
                .add("Bacon")
                .addAt("Onion", 3)
                .addAt("Olives", 0)
                .tomato()
                .addAt("Sausage", 6)
                .patato()
                .cheese()
                .addAt("Peppers", 5);

        pizza.display();
    }
}
