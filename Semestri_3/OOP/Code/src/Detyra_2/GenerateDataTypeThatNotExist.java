package Detyra_2;

import java.util.LinkedList;

public class GenerateDataTypeThatNotExist implements ClassBuilderExpendInterface {
    private static void generateClassName(ClassBuilder.Builder builder, String className) {
        builder.getCodeBuilder().insert(0, "\nclass " + className + " {}");
    }

    public void extend(ClassBuilder.Builder builder) {
        LinkedList<String> builderList = new LinkedList<>();

        boolean isJavaUnit = false;

        for (AttributeObject attribute : builder.getGenerator().getAttributes()) {
            if (!isPrimitive(attribute.getDataType())) {
                builderList.add(attribute.getDataType());
            }

            if (isJavaUnit(attribute.getDataType()))
                isJavaUnit = true;
        }

        for (String className : builderList) {
            generateClassName(builder, className);
        }

        if (isJavaUnit)
            builder.importJavaUnit();

    }

    private boolean isJavaUnit(String type) {
        return (type.contains("<") && type.contains(">"));
    }

    private boolean isPrimitive(String type) {
//        make on array
        String[] primitives = {
                "String",
                "long",
                "double",
                "float",
                "int",
                "short",
                "char",
                "byte",
                "boolean",
        };

        for (String primitive : primitives) {
            if (type.equals(primitive) || (type.contains("<") && type.contains(">"))) {
                return true;
            }
        }

        return false;
    }
}
