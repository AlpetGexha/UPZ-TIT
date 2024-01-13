package Detyra.ClassBuilder;

// Test Object to test the ClassBuilder
public class ClassObjectBuilder {
    public static void main(String[] args) {
        String input = "src/Detyra.ClassBuilder/input.txt";

        ClassBuilder.GenerateClass()
                .readFile(input)
                .generateBasic()
                .extend(new GenerateDataTypeThatNotExist())
                .build();

    }
}
