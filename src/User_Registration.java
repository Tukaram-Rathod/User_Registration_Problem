import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {
      public static boolean isValidEmail(String email) {
        // Regex to check valid Email.
        //String regex = "^([a-z 0-9].+[a-z 0-9])@([a-z].+)([a-z].+[a-z])$";
          String regex = ("^(.+)@(.+)$");
          // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher m = p.matcher(email);
          // matched the ReGex
        return m.matches();
    }

       public static void main(String[] args) {
            // Test UseCase: 2
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Email:");
           String str1 = sc.nextLine();
           System.out.println(isValidEmail(str1));
        }
}