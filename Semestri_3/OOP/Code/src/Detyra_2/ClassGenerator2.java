package Detyra_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClassGenerator2 {
    public final List<AttributeObject> attributes;
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
                .getters()
                .setters()
                .toStrings()
                .build();
    }

    public static class Builder {
        private final ClassGenerator2 generator;
        private PrintWriter writer;

        public Builder() {
            generator = new ClassGenerator2();
        }

        private static String pascalCase(String name) {
            return name.substring(0, 1).toUpperCase() + name.substring(1);
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

        public Builder defaultConstructor() {
            generateDefaultConstructor();

            return this;
        }

        public Builder constructor() {
            generateConstructor();
            defaultConstructor();

            return this;
        }

        public Builder constructors() {
            constructor();

            return this;
        }

        public Builder setters() {
            for (AttributeObject attribute : generator.attributes) {
                generateSetter(attribute);
            }

            return this;
        }

        public Builder getters() {
            for (AttributeObject attribute : generator.attributes) {
                generateGetter(attribute);
            }

            return this;
        }

        public Builder toStrings() {
            generateToString();

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
                if (attributeLine.trim().isEmpty()) {
                    continue;
                }

                AttributeObject attribute = new AttributeObject(attributeLine.trim());
                generator.attributes.add(attribute);
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
            for (AttributeObject attribute : generator.attributes) {
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

            for (AttributeObject attribute : generator.attributes) {
                writer.print(printConstructorParameter(attribute));
            }

            writer.println(") {");

            for (AttributeObject attribute : generator.attributes) {
                writer.println(printConstrucotorInitialize(attribute));
            }

            writer.println("    }");
        }

        private void generateDefaultConstructor() {
            writer.println("    public " + generator.className + "() {");
            for (AttributeObject attribute : generator.attributes) {
                String type = attribute.dataType;
                String name = attribute.variableName;

                if (type.equals("int")) {
                    writer.println("        " + attribute.staticReturn() + name + " = 0;");
                } else if (type.equals("boolean")) {
                    writer.println("        " + attribute.staticReturn() + name + " = false;");
                } else {
                    writer.println("        " + attribute.staticReturn() + name + " = \"\";");
                }
            }
            writer.println("}");
        }

        private void generateToString() {
            writer.println("\n" + "    public String toString() {");
            writer.println("        return");
            for (AttributeObject attribute : generator.attributes) {
                String name = attribute.variableName;
                writer.println("                \"" + name + ": \" + " + attribute.staticReturn() + name + " +");
            }
            writer.println("                \"\";");
            writer.println("    }");
        }

        private void generateSetter(AttributeObject attribute) {
            writer.println(printSetter(attribute));
        }

        private void generateGetter(AttributeObject attribute) {
            writer.println(printGetter(attribute));
        }


        private String printConstructorParameter(AttributeObject attribute) {
            return attribute.dataType + " " + attribute.variableName + (attribute.isStatic ? "n" : "") +
                    (generator.attributes.indexOf(attribute) == generator.attributes.size() - 1 ? "" : ", ");
        }

        private String printConstrucotorInitialize(AttributeObject attribute) {
            return "        " + attribute.staticReturn() + attribute.variableName + " = " + attribute.variableName + (attribute.isStatic ? "n" : "") + ";";
        }

        private String printSetter(AttributeObject attribute) {
            String type = attribute.dataType;
            String name = attribute.variableName;
            String isStatic = attribute.isStatic ? "n" : "";

            return "\n" +
                    "    public void set" + pascalCase(name) + "(" + type + " " + (name + isStatic) + ") {" + "\n" +
                    "        " + attribute.staticReturn() + name + " = " + (name + isStatic) + ";" + "\n" +
                    "    }";

        }

        private String printGetter(AttributeObject attribute) {

            String type = attribute.dataType;
            String name = attribute.variableName;

            return "\n" +
                    "    public " + type + " get" + pascalCase(name) + "() {" + "\n" +
                    "        return " + attribute.staticReturn() + name + ";" + "\n" +
                    "    }";
        }


    }
}
