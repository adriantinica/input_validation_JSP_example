package validation;
import java.util.HashMap;
import java.util.Map;

public class ValidationRules {
    private Map<String, String> rules;

    public ValidationRules() {
        rules = new HashMap<>();
        initializeRules();
    }

    public void initializeRules() {
        // Example: Username should be a compound of first name and last name with a space between them,
        // and both names should start with capital letters
        rules.put("username ", "^[A-Z][a-zA-Z]*\\s[A-Z][a-zA-Z]*$");

        // Example: Email validation
        rules.put("email ", "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$");
        
        // Example: Phone number should be 8 digits
        rules.put("phoneNumber ", "^\\d{8}$");

        // Example: Password should be at least 8 characters long
        rules.put("password ", "^.{8,}$");

        // Example: Confirm password should be at least 8 characters long
        rules.put("cpassword ", "^.{8,}$");

    }

    public Map<String, String> getRules() {
        return rules;
    }





}
