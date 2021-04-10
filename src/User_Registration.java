import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {
      public static boolean isValidFirstName(String fname) {
        // Regex to check valid firstname.
        String regex = "^[A-Z]{1}[a-z]{3,}$";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        if (fname == null) {
            return false;
        }
        Matcher m = p.matcher(fname);
          // matched the ReGex
        return m.matches();
    }

       public static void main(String[] args) {
            // Test UseCase: 1
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter First Name:");
           String str1 = sc.nextLine();
           //String str1 = "Ashish";
            System.out.println(isValidFirstName(str1));
        }
}