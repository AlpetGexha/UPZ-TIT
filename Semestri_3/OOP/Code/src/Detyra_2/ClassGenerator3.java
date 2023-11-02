package Detyra_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClassGenerator3 {
    private final List<String> attributes;
    private String className;

    // Private constructor to enforce the use of the builder
    private ClassGenerator3() {
        attributes = new ArrayList<>();
    }

    public static Builder GenerateClass() {
        return new Builder();
    }

    public static void main(String[] args) {
        GenerateClass()
                .readInputFromFile("src/Detyra_2/input.txt")
                .constructors()
                .setters()
                .getters()
                .build();
    }

    // Builder class
    public static class Builder {
        private final ClassGenerator3 generator;
        private PrintWriter writer;

        public Builder() {
            generator = new ClassGenerator3();
        }

        public Builder readInputFromFile(String inputFile) {
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
                generator.className = classContentStr.substring(classNameStart, classNameEnd).trim();

                int attributesStart = classContentStr.indexOf("{") + 1;
                int attributesEnd = classContentStr.lastIndexOf("}");
                String attributesBlock = classContentStr.substring(attributesStart, attributesEnd).trim();
                String[] attributeLines = attributesBlock.split(";");
                for (String attributeLine : attributeLines) {
                    String attribute = attributeLine.trim();
                    if (!attribute.isEmpty()) {
                        generator.attributes.add(attribute);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            return this;
        }

        public Builder constructors() {
            createPrintWriter();
            generateConstructor();
            generateDefaultConstructor();
            return this;
        }

        public Builder setters() {
            generateSetters();
            return this;
        }

        public Builder getters() {
            generateGetters();
            return this;
        }

        public void build() {
            generateJavaClass();
        }

        private void createPrintWriter() {
            try {
                writer = new PrintWriter(new FileWriter("src/Detyra_2/" + generator.className + ".java"));
                writer.println("public class " + generator.className + " {");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void generateJavaClass() {
            if (writer != null) {

                for (String attribute : generator.attributes) {
                    // Check if the attribute declaration includes the "public" modifier
                    if (!attribute.startsWith("public")) {
                        // If not, add "public" before the attribute
                        attribute = "public " + attribute;
                    }
                    writer.println("    " + attribute + ";");
                }
                writer.println("}");

                System.out.println("Generated " + generator.className + ".java");
                writer.close();
            }
        }

        private void generateConstructor() {
            if (writer != null) {
                writer.print("    public " + generator.className + "(");
                for (int i = 0; i < generator.attributes.size(); i++) {
                    String attribute = generator.attributes.get(i);
                    writer.print((i > 0 ? ", " : "") + attribute.split(" ")[1] + " " + attribute.split(" ")[2]);
                }
                writer.println(") {");
                for (String attribute : generator.attributes) {
                    String attributeName = attribute.split(" ")[2].replace(";", "").trim();
                    writer.println("        this." + attributeName + " = " + attributeName + ";");
                }
                writer.println("    }");
            }
        }

        private void generateDefaultConstructor() {
            if (writer != null) {
                writer.println("    public " + generator.className + "() {");
                for (String attribute : generator.attributes) {
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
            }
        }

        private void generateSetters() {
            for (String attribute : generator.attributes) {
                String[] parts = attribute.trim().split(" ");
                String type = parts[1];
                String name = parts[2].replace(";", "").trim();

                writer.println();
                writer.println("    public " + type + " get" + name.substring(0, 1).toUpperCase() + name.substring(1) + "() {");
                writer.println("        return this." + name + ";");
                writer.println("    }");
                writer.println();
            }
        }

        private void generateGetters() {
            for (String attribute : generator.attributes) {
                String[] parts = attribute.trim().split(" ");
                String type = parts[1];
                String name = parts[2].replace(";", "").trim();

                writer.println();
                writer.println("    public void set" + name.substring(0, 1).toUpperCase() + name.substring(1) + "(" + type + " " + name + ") {");
                writer.println("        this." + name + " = " + name + ";");
                writer.println("    }");
            }
        }
    }
}
