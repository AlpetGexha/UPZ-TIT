package Detyra_2;

public class ClassObjectBuilder {
    public static void main(String[] args) {

        String input = "src/Detyra_2/input.txt";

        ClassBuilder.GenerateClass()
                .readFile(input)
                .generate()
                .extend(new ObjectAsClassExtension())
                .build();

    }
}
