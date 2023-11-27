package validation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import validation.ValidationRules;

public class Validation {

    
    public static boolean validate(Map<String, String> formData, Map<String, String> rules){

      Set<String> keys1 = formData.keySet();
      Set<String> keys2 = rules.keySet();
      Map<String, String> failed = new HashMap<>();

      if (!keys1.equals(keys2)) {
        System.out.println("Hashmaps have different keys");
        return false;
      }
      for (String key : formData.keySet()) {
        String dataValue = formData.get(key);
        String regex = rules.get(key);

        //if (regex == null) {
        //  System.out.println("No rule defined for key: " + key);
        //  continue;
        //}

        if (!Pattern.matches(regex, dataValue)) {
          failed.put(key, dataValue);
        }
      }

      if(failed.isEmpty()){
        System.out.println("Register passed successful !!!");
      }else{
        System.out.println("WARNING !!! ");
        System.out.println("REGISTER FAILED !!! ");
        System.out.println("Invalid credentials: ");
        System.out.println();

        for (Map.Entry<String, String> entry : failed.entrySet()) {
          String failedKey = entry.getKey();
          String value = entry.getValue();
          System.out.println(failedKey + " : " + value);
          System.out.println("Reason: The value does not match the required pattern.");
          
        }
      System.out.println();
    }
      
     
     return true;
    }

}
