package Detyra.ClassBuilder;

public class AttributeObject {
    private boolean isStatic = false;
    private boolean isFinal = false;
    private String accessModifier;
    private String dataType;
    private String variableName;
    private String value;

    public AttributeObject(String attribute) {
        String tmp = attribute;
        if (attribute.contains("=")) {
            tmp = attribute.split("=")[0].trim();

            this.value = attribute.split("=")[1]
                    .replace(";", "")
//                    .replace("\"", "")
                    .trim();
        }

        if (tmp.contains("static")) {
            this.isStatic = true;
            tmp = tmp.replace("static", "");
        }

        if (tmp.contains("final")) {
            this.isFinal = true;
            tmp = tmp.replace("final", "");
        }

        String[] parts = tmp.split("\\s+");

        if (parts.length == 2) {
            this.accessModifier = addAccessModifyIfNotExists(parts[0]);
            this.dataType = parts[0];
            this.variableName = parts[1];

        } else if (parts.length == 3) {
            this.accessModifier = addAccessModifyIfNotExists(parts[0]);
            this.dataType = parts[1];
            this.variableName = parts[2];
        }

    }

    private String addAccessModifyIfNotExists(String attribute) {
        if (!attribute.startsWith("public") && !attribute.startsWith("private") && !attribute.startsWith("protected")) {
            return "public";
        }

        return attribute;
    }

    public String toString() {
//
        String value = this.value != null ? " = " + this.value : "";
        String isStatic = this.isStatic ? " static" : "";
        String isFinal = this.isFinal ? " final" : "";

        return String.format("%s%s%s %s %s %s",
                this.accessModifier, isStatic, isFinal, this.dataType, this.variableName, value
        );
    }

    public String staticReturn() {
        return (isStatic) ? "" : "this.";
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getVariableName() {
        return this.variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public boolean isStatic() {
        return this.isStatic;
    }

    public void setStatic(boolean aStatic) {
        this.isStatic = aStatic;
    }

    public boolean isFinal() {
        return this.isFinal;
    }

    public void setFinal(boolean aFinal) {
        this.isFinal = aFinal;
    }

    public String getAccessModifier() {
        return this.accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
