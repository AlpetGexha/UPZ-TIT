package Detyra_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClassGenerator {
    final List<String> attributes;
    String className;

    public ClassGenerator() {
        attributes = new ArrayList<>();
    }

    public static void main(String[] args) {
        ClassGenerator classGenerator = new ClassGenerator();
        classGenerator.readInputFromFile("src/Detyra_2/input.txt");
        classGenerator.generateJavaClass();
    }

    public void readInputFromFile(String inputFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            StringBuilder classContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                classContent.append(line).append("\n");
            }

            String classContentStr = classContent.toString();
            int classNameStart = classContentStr.indexOf("class ") + 6;
            int classNameEnd = classContentStr.indexOf("{");
            className = classContentStr.substring(classNameStart, classNameEnd).trim();

            int attributesStart = classContentStr.indexOf("{") + 1;
            int attributesEnd = classContentStr.lastIndexOf("}");
            String attributesBlock = classContentStr.substring(attributesStart, attributesEnd).trim();
            String[] attributeLines = attributesBlock.split(";");
            for (String attributeLine : attributeLines) {
                String attribute = attributeLine.trim();
                if (!attribute.isEmpty()) {
                    attributes.add(attribute);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generateJavaClass() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("src/Detyra_2/" + className + ".java"));
            writer.println("public class " + className + " {");

            // Generate attributes
            for (String attribute : attributes) {
                writer.println("    " + attribute + ";");
            }
            writer.println();

            // Generate constructor
            writer.print("    public " + className + "(");
            for (int i = 0; i < attributes.size(); i++) {
                String attribute = attributes.get(i);
                writer.print((i > 0 ? ", " : "") + attribute.split(" ")[1] + " " + attribute.split(" ")[2]);
            }
            writer.println(") {");
            for (String attribute : attributes) {
                String attributeName = attribute.split(" ")[2].replace(";", "").trim();
                writer.println("        this." + attributeName + " = " + attributeName + ";");
            }
            writer.println("    }");

            // Generate default constructor
            writer.println("    public " + className + "() {");
            for (String attribute : attributes) {
                String[] parts = attribute.trim().split(" ");
                String type = parts[1];
                String name = parts[2].replace(";", "").trim();
                if (type.equals("int")) {
                    writer.println("        this." + name + " = 0;");
                } else {
                    writer.println("        this." + name + " = \"\";");
                }
            }
            writer.println("}");
            // Generate getter and setter methods
            for (String attribute : attributes) {
                String[] parts = attribute.trim().split(" ");
                String type = parts[1];
                String name = parts[2].replace(";", "").trim();

                writer.println();
                writer.println("    public " + type + " get" + name.substring(0, 1).toUpperCase() + name.substring(1) + "() {");
                writer.println("        return this." + name + ";");
                writer.println("    }");
                writer.println();
                writer.println("    public void set" + name.substring(0, 1).toUpperCase() + name.substring(1) + "(" + type + " " + name + ") {");
                writer.println("        this." + name + " = " + name + ";");
                writer.println("    }");
            }

// Generate toString method
            writer.println();
            writer.println("    public String toString() {");
            writer.print("        return ");
            for (int i = 0; i < attributes.size(); i++) {
                String attributeName = attributes.get(i).split(" ")[2].replace(";", "").trim();
                        writer.print("this." + attributeName + " + ");
                if (i < attributes.size() - 1) {
                    writer.print("\" \" + ");
                }
            }
            writer.println(";");

            writer.println("    }");
            writer.println("}");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Generated " + className + ".java");
    }
}
