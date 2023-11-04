package Detyra_2;

import java.util.LinkedList;

public class ObjectAsClassExtension implements ClassBuilderExtension {
    private static void generateClassName(ClassBuilder.Builder builder, String className) {
        builder.getCodeBuilder().insert(0, "\nclass " + className + " {}");
    }

    public void extend(ClassBuilder.Builder builder) {
        LinkedList<String> builderList = new LinkedList<>();

        for (AttributeObject attribute : builder.getGenerator().attributes) {
            if (!isPrimitive(attribute.dataType)) {
                builderList.add(attribute.dataType);
            }
        }

        for (String className : builderList) {
            generateClassName(builder, className);
        }
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
