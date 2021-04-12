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
    public static boolean isValidEmail(String email) {
      // Regex to check valid Email.
      String regex = ("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
      // Compile the ReGex
      Pattern p = Pattern.compile(regex);
      if (email == null) {
         return false;
       }
      Matcher m = p.matcher(email);
      // matched the ReGex
      return m.matches();
    }
    public static boolean isValidmobNo(String mobNo) {
        // Regex to check valid Email.
        String regex = ("^\\+(?:[0-9] ?){6,14}[0-9]$");
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        if (mobNo == null) {
            return false;
        }
        Matcher m = p.matcher(mobNo);
        // matched the ReGex
        return m.matches();
    }
    //UC-5-6-7-8
    public static boolean isValidPassword(String pass) {
        // Regex to check valid Email.
        String regex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
        //^                                   # start of line
        //  (?=.*[0-9])                       # positive lookahead, digit [0-9]
        //  (?=.*[a-z])                       # positive lookahead, one lowercase character [a-z]
        //  (?=.*[A-Z])                       # positive lookahead, one uppercase character [A-Z]
        //  (?=.*[!@#&()–[{}]:;',?/*~$^+=<>]) # positive lookahead, one of the special character in this [..]
        //  .                                 # matches anything
        //  {8,20}                            # length at least 8 characters and maximum of 20 characters
        //$                                   # end of line
//        For example, b(?=c) matches a b that is followed by a c. (positive lookahead)
//        For example, b(?!c) matches a b that is NOT followed by a c. (negative lookahead)
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        if (pass == null) {
            return false;
        }
        Matcher m = p.matcher(pass);
        // matched the ReGex
        return m.matches();
    }

       public static void main(String[] args) {
            // Test UseCase: 2
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter First Name:");
           String fname = sc.nextLine();
           System.out.println("Enter Last Name:");
           String lname = sc.nextLine();
           System.out.println("Enter Email:");
           String email = sc.nextLine();
           System.out.println("Enter Mobile Number:");
           String mobNo = sc.nextLine();
           System.out.println("Enter Password:");
           String pass = sc.nextLine();
           System.out.println(isValidFirstName(fname));
           System.out.println(isValidLastName(lname));
           System.out.println(isValidEmail(email));
           System.out.println(isValidmobNo(mobNo));
           System.out.println(isValidPassword(pass));
        }
}