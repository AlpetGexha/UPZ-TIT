package Detyra.FileReader;

import java.util.HashMap;
import java.util.Map;

interface ValidationRule {
    void validate(Object value, ValidationResult result, String fieldName);
}

public class Validate {
    public static void main(String[] args) {
        // Example input map with validation rules
        HashMap<String, String> validationRules = new HashMap<>();
        validationRules.put("age", "required|min:2|max:3");
        validationRules.put("username", "required|min:3|max:20");
        validationRules.put("email", "required|email");
        validationRules.put("customField", "isStringOrInteger");

        // Example data to be validated
        HashMap<String, Object> data = new HashMap<>();
        data.put("age", 25);
        data.put("username", "john_doe");
        data.put("email", "john@example.com");
        data.put("customField", "example");

        // Initialize the validator
        Validator validator = new Validator();

        // Add custom validation rules
        validator.addRule("email", new EmailValidationRule());
        validator.addRule("customField", new StringOrIntegerValidationRule());

        // Perform validation
        ValidationResult result = validator.validate(data, validationRules);

        // Print validation result
        if (result.isValid()) {
            System.out.println("Data is valid!");
        } else {
            System.out.println("Data is not valid.");
            result.printErrors();
        }
    }
}

class Validator {
    private final Map<String, ValidationRule> customRules = new HashMap<>();

    public void addRule(String fieldName, ValidationRule rule) {
        customRules.put(fieldName, rule);
    }

    public ValidationResult validate(Map<String, Object> data, Map<String, String> validationRules) {
        ValidationResult result = new ValidationResult();

        for (Map.Entry<String, String> entry : validationRules.entrySet()) {
            String field = entry.getKey();
            String rules = entry.getValue();

            if (data.containsKey(field)) {
                Object value = data.get(field);
                String[] ruleArray = rules.split("\\|");

                for (String rule : ruleArray) {
                    if (rule.equals("required")) {
                        if (value == null || value.toString().isEmpty()) {
                            result.addError(field + " is required.");
                        }
                    } else if (rule.startsWith("min:")) {
                        int minValue = Integer.parseInt(rule.substring(4));
                        if (value instanceof Integer && ((int) value) < minValue) {
                            result.addError(field + " must be at least " + minValue + ".");
                        }
                    } else if (rule.startsWith("max:")) {
                        int maxValue = Integer.parseInt(rule.substring(4));
                        if (value instanceof Integer && ((int) value) > maxValue) {
                            result.addError(field + " must be at most " + maxValue + ".");
                        }
                    } else {
                        ValidationRule customRule = customRules.get(field);
                        if (customRule != null) {
                            customRule.validate(value, result, field);
                        }
                    }
                }
            }
        }

        return result;
    }
}

class EmailValidationRule implements ValidationRule {
    @Override
    public void validate(Object value, ValidationResult result, String fieldName) {
        if (!(value instanceof String) || !value.toString().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            result.addError(fieldName + " is not a valid email.");
        }
    }
}

class StringOrIntegerValidationRule implements ValidationRule {
    @Override
    public void validate(Object value, ValidationResult result, String fieldName) {
        if (!(value instanceof String) && !(value instanceof Integer)) {
            result.addError(fieldName + " must be a String or Integer.");
        }
    }
}

class ValidationResult {
    private final HashMap<String, String> errors = new HashMap<>();
    private boolean valid = true;

    public boolean isValid() {
        return valid;
    }

    public void addError(String error) {
        valid = false;
        errors.put(error, error);
    }

    public HashMap<String, String> getErrors() {
        return errors;
    }

    public void printErrors() {
        for (Map.Entry<String, String> entry : errors.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

