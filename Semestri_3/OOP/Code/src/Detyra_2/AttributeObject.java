package Detyra_2;

public class AttributeObject {
    public boolean isStatic = false;
    public boolean isFinal = false;
    public String accessModifier;
    public String dataType;
    public String variableName;
    public String value;

    public AttributeObject(String attribute) {

        String tmp = "";
        if (attribute.contains("=")) {
            tmp = attribute.split("=")[0].trim();

            this.value = attribute.split("=")[1]
                    .replace(";", "")
                    .replace("\"", "")
                    .trim();
        }

        if (tmp.contains("static")) {
            this.isStatic = true;
            tmp = tmp.replace("static", "").trim();
        }

        if (tmp.contains("final")) {
            this.isFinal = true;
            tmp = tmp.replace("final", "").trim();
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
}
