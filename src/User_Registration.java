import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {
      public static boolean isValidLastName(String lname) {
        // Regex to check valid lasttname.
        String regex = "^[A-Z]{1}[a-z]{3,}$";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        if (lname == null) {
            return false;
        }
        Matcher m = p.matcher(lname);
          // matched the ReGex
        return m.matches();
    }

       public static void main(String[] args) {
            // Test UseCase: 2
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Last Name:");
           String str1 = sc.nextLine();
           System.out.println(isValidLastName(str1));
        }
}