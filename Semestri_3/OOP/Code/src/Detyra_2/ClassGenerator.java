package Detyra_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClassGenerator {
    public final List<AttributeObject> attributes;
    private String className;

    private ClassGenerator() {
        attributes = new ArrayList<>();
    }

    public static Builder GenerateClass() {
        return new Builder();
    }

    public static void main(String[] args) {

        String input = "src/Detyra_2/input.txt";

//        Builder builder = GenerateClass()
//                .readFile(input)
//                .generate()
//                .constructors()
//                .getters()
//                .setters()
//                .toStrings();
//
//        builder.build();

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
        private final ClassGenerator generator;
        private final StringBuilder codeBuilder;
        private PrintWriter writer;

        public Builder() {
            generator = new ClassGenerator();
            codeBuilder = new StringBuilder();
        }

        private static String pascalCase(String name) {
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        public Builder readFile(String file) {
            readInputFromFile(file);

            return this;
        }

        public Builder generate() {
            generateClass();
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
            generateSetters();

            return this;
        }

        public Builder getters() {
            generateGetters();

            return this;
        }

        public Builder toStrings() {
            generateToString();

            return this;
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

        private void generateClass() {
            codeBuilder.append("\n public class ").append(generator.className).append(" {");
        }

        private void generateAttribute() {
            for (AttributeObject attribute : generator.attributes) {
                codeBuilder.append("\n    " + attribute + ";");
            }
        }

        private void generateConstructor() {
            codeBuilder.append("\n    public " + generator.className + "(");

            for (AttributeObject attribute : generator.attributes) {
                codeBuilder.append(printConstructorParameter(attribute));
            }

            codeBuilder.append(") {");

            for (AttributeObject attribute : generator.attributes) {
                codeBuilder.append(printConstrucotorInitialize(attribute));
            }

            codeBuilder.append("\n    }\n");
        }

        private void generateDefaultConstructor() {
            codeBuilder.append("\n    public " + generator.className + "() {");
            for (AttributeObject attribute : generator.attributes) {
                String type = attribute.dataType;
                String name = attribute.variableName;

                if (type.equals("int")) {
                    codeBuilder.append("\n        " + attribute.staticReturn() + name + " = 0;");
                } else if (type.equals("boolean")) {
                    codeBuilder.append("\n        " + attribute.staticReturn() + name + " = false;");
                } else {
                    codeBuilder.append("\n        " + attribute.staticReturn() + name + " = \"\";");
                }
            }
            codeBuilder.append("\n     }\n");
        }

        private void generateSetter(AttributeObject attribute) {
            codeBuilder.append(printSetter(attribute));
        }

        private void generateSetters() {
            for (AttributeObject attribute : generator.attributes) {
                generateSetter(attribute);
            }
        }

        private void generateGetter(AttributeObject attribute) {
            codeBuilder.append(printGetter(attribute));
        }

        public void generateGetters() {
            for (AttributeObject attribute : generator.attributes) {
                generateGetter(attribute);
            }
        }

        private void generateToString() {
            codeBuilder.append("\n\n" + "    public String toString() {");
            codeBuilder.append("\n        return");
            for (AttributeObject attribute : generator.attributes) {
                String name = attribute.variableName;
                codeBuilder.append("\n                \"" + name + ": \" + " + attribute.staticReturn() + name + " +");
            }
            codeBuilder.append("\n                \"\";");
            codeBuilder.append("\n    }");
        }

        private String printConstructorParameter(AttributeObject attribute) {
            return attribute.dataType + " " + attribute.variableName + (attribute.isStatic ? "n" : "") +
                    (generator.attributes.indexOf(attribute) == generator.attributes.size() - 1 ? "" : ", ");
        }

        private String printConstrucotorInitialize(AttributeObject attribute) {
            return "\n        " + attribute.staticReturn() + attribute.variableName + " = " + attribute.variableName + (attribute.isStatic ? "n" : "") + ";";
        }

        private String printSetter(AttributeObject attribute) {
            String type = attribute.dataType;
            String name = attribute.variableName;
            String isStatic = attribute.isStatic ? "n" : "";

            return "\n" +
                    "    public void set" + pascalCase(name) + "(" + type + " " + (name + isStatic) + ") {" + "\n" +
                    "        " + attribute.staticReturn() + name + " = " + (name + isStatic) + ";" + "\n" +
                    "    }\n";

        }

        private String printGetter(AttributeObject attribute) {

            String type = attribute.dataType;
            String name = attribute.variableName;

            return "\n" +
                    "    public " + type + " get" + pascalCase(name) + "() {" + "\n" +
                    "        return " + attribute.staticReturn() + name + ";" + "\n" +
                    "    }\n";
        }

        private void closeClass() {
            codeBuilder.append("\n}");
        }

        public void build() {
            closeClass();

            try {
                String fileName = "src/Detyra_2/" + generator.className + ".java";

                checkIfFileExists(fileName);

                writer = new PrintWriter(new FileWriter(fileName));
                writer.write(codeBuilder.toString());

                System.out.println("Class " + generator.className + " generated successfully!");

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        public void showCode() {
            closeClass();
            System.out.println(codeBuilder);
        }

        public void checkIfFileExists(String fileName) throws Exception {
            File file = new File(fileName);

            if (file.exists()) {
                throw new Exception("File already Exist " + fileName);
            }

        }
    }
}
