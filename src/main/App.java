package main;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import validation.Validation;
import validation.ValidationRules;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Map<String, String> formData = new HashMap<>();
        Scanner scanner  = new Scanner(System.in) ;

        System.out.println("Enter your full name: ");
        String fullname =scanner.nextLine();

        System.out.println("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.println("Enter your phone number (at least 8 characters) +383: ");
        String phone = scanner.nextLine();
        
        System.out.println("Choose a password(at least 8 characters): ");
        String password = scanner.nextLine();
        
        System.out.println("Repeat the password: ");
        String cpassword = scanner.nextLine();

        scanner.close();

        formData.put("username ", fullname);
        formData.put("email ", email);
        formData.put("phoneNumber ", phone);
        formData.put("password ", password);
        formData.put("cpassword ", cpassword);

        ValidationRules validationRulesInstance = new ValidationRules();

        // Call the initializeRules method on the instance
        Map<String, String> rules= validationRulesInstance.getRules();
        

        Validation.validate(formData, rules);
        
       
            
        






    }

    
}
