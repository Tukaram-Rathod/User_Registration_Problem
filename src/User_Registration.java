import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {
    public static void main(String[] args) {
        System.out.println("******Email sample Test******");

        //Email sample Test
        //1. abc@yahoo.com
        System.out.println(Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`~^.-]+@[a-zA-Z0-9.-]*$", "abc@yahoo.com"));//true
        //2. abc-100@yahoo.com,
        System.out.println(Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`~^.-]+@[a-zA-Z0-9.-]*$","abc-100@yahoo.com"));//true
        //• 3. abc.100@yahoo.com
        System.out.println(Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`~^.-]+@[a-zA-Z0-9.-]*$", "abc.100@yahoo.com"));//true
        //• 2. abc111@abc.com,
        System.out.println(Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`~^.-]+@[a-zA-Z0-9.-]*$", "abc111@abc.com"));//true
        //• 4. abc-100@abc.net,
        System.out.println(Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`~^.-]+@[a-zA-Z0-9.-]*$", "abc-100@abc.net"));//true
        //• 5. abc.100@abc.com.au
        System.out.println(Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`~^.-]+@[a-zA-Z0-9.-]*$", "abc.100@abc.com.au"));//true
        //• 6. abc@1.com,
        System.out.println(Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`~^.-]+@[a-zA-Z0-9.-]*$", "abc@1.com"));//true
        //• 7. abc@gmail.com.com
        System.out.println(Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`~^.-]+@[a-zA-Z0-9.-]*$", "abc@gmail.com.com"));//true
        //• 8. abc+100@gmail.com
        System.out.println(Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`~^.-]+@[a-zA-Z0-9.-]*$","abc+100@gmail.com"));//true

    }
}