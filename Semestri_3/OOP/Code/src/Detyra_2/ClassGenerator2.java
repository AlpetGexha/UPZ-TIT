package Detyra_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClassGenerator2 {
    public final List<String> attributes;
    private String className;

    private ClassGenerator2() {
        attributes = new ArrayList<>();
    }

    public static Builder GenerateClass() {
        return new Builder();
    }

    public static void main(String[] args) {

        String input = "src/Detyra_2/input.txt";

        GenerateClass()
                .readFile(input)
                .generate()
                .constructors()
                .setters()
                .getters()
                .build();

    }

    public static class Builder {
        private final ClassGenerator2 generator;
        private PrintWriter writer;

        public Builder() {
            generator = new ClassGenerator2();
        }

        public void readInputFromFile(String inputFile) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) { // try-with-resources
                StringBuilder classContent = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    classContent.append(line).append("\n");
                }

                String classContentStr = classContent.toString();

                extractClassName(classContentStr);
                extractAttributes(classContentStr);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public Builder readFile(String file) {
            readInputFromFile(file);

            return this;
        }

        public Builder generate() {
            createPrintWriter();
            generateAttribute();
            return this;
        }

        public Builder constructors() {
            generateConstructor();
            generateDefaultConstructor();
            return this;
        }

        public Builder setters() {
            for (String attribute : generator.attributes) {
                generateSetter(attribute);
            }
            return this;
        }

        public Builder getters() {
            for (String attribute : generator.attributes) {
                generateGetter(attribute);
            }
            return this;
        }

        public void build() {
            generateJavaClass();
        }

        private void extractClassName(String classContentStr) {
            int classNameStart = classContentStr.indexOf("class ") + 6;
            int classNameEnd = classContentStr.indexOf("{");
            generator.className = classContentStr.substring(classNameStart, classNameEnd).trim();
        }

        private void extractAttributes(String classContentStr) {
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
        }

        private void createPrintWriter() {
            try {
                checkIfFileExist("src/Detyra_2/" + generator.className + ".java");

                writer = new PrintWriter(new FileWriter("src/Detyra_2/" + generator.className + ".java"));

                writer.println("public class " + generator.className + " {");

            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        private void checkIfFileExist(String file) throws Exception {
            File f = new File(file);

            if (f.exists() && !f.isDirectory()) {
                throw new Exception("File already exists");
            }
        }

        private void generateAttribute() {
            for (String attribute : generator.attributes) {
                writer.println("    " + attribute + ";");
            }
        }

        private void generateJavaClass() {
            writer.println("}");

            System.out.println("Generated " + generator.className + ".java");
            writer.close();
        }

        private void generateConstructor() {
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

        private void generateDefaultConstructor() {
            writer.println("    public " + generator.className + "() {");
            for (String attribute : generator.attributes) {
                String[] parts = attribute.trim().split(" ");
                String type = parts[1];
                String name = parts[2].replace(";", "").trim();
                writer.println("        this." + name + " = " + (type.equals("int") ? "0" : "\"\"") + ";");
            }
            writer.println("}");
        }

        private void generateSetter(String attribute) {
            String[] parts = attribute.trim().split(" ");
            String type = parts[1];
            String name = parts[2].replace(";", "").trim();

            writer.println();
            writer.println("    public void set" + name.substring(0, 1).toUpperCase() + name.substring(1) + "(" + type + " " + name + ") {");
            writer.println("        this." + name + " = " + name + ";");
            writer.println("    }");
        }

        private void generateGetter(String attribute) {
            String[] parts = attribute.trim().split(" ");
            String type = parts[1];
            String name = parts[2].replace(";", "").trim();

            writer.println();
            writer.println("    public " + type + " get" + name.substring(0, 1).toUpperCase() + name.substring(1) + "() {");
            writer.println("        return this." + name + ";");
            writer.println("    }");
        }
    }
}
