import java.util.Scanner;
import java.util.regex.*;


public class Utilities {
    /** The method collects and confirms integer */
    public static Integer getInputNumber(String commPrompt, int maxValue) {
        int numResult = 0;
        boolean flag = true;
        String n;
        // open the scanner to collect input
        Scanner input = new Scanner(System.in);

        // display the user message
        System.out.println(commPrompt);
        do {
            n = input.next();
            try {
                Integer.parseInt(n);
                numResult = Integer.parseInt(n);
                if (numResult > 0 && numResult < maxValue) {
                    flag = false;
                    System.out.println("Testing");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println(commPrompt);
                flag=true;
            }
        }while (flag);
        // printing out just to check assignment is successful
//        System.out.println(numResult);

        input.close();
        return numResult;
    }
public static String getUserName(String commPrompt){
    String strResult = "";
    boolean flag = true;
    String n;
    // open the scanner to collect input
    Scanner input = new Scanner(System.in);

    // display the user message
    System.out.println(commPrompt);
    /*do {
        n = input.next();
        try {
            n == regexp = "/[/0123456789!$%^&*()_+|~=`{}[:;<>?,.@#\\]]/g, \"\"";
            if (numResult > 0 && numResult < maxValue) {
                flag = false;
                System.out.println("Testing");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println(commPrompt);
            flag=true;
        }
    }while (flag);
    // printing out just to check assignment is successful
//        System.out.println(numResult);
*/
    input.close();
    return strResult;
}

    // test if the email format is valid
    private static boolean emailTester (String testMail) {
        Pattern pattern = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
                + "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
                + "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9]"
                + "(?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(testMail);
        return (matcher.find());
    }

    // test if input has special characters
    private static boolean userInputTester(String enTester){
        Pattern regex = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = regex.matcher(enTester);
        return (matcher.find());
    }

}

