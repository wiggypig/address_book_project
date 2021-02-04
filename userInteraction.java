import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class userInteraction {
    // variables - class global
    private static final List<String> arrMenuOps = new ArrayList<>(Arrays.asList("---Please Select A Function By Entering The Number---", "1) Add an entry", "2) Remove an entry",
            "3) Search ro a specific entry", "4) Print Address Book", "5) Delete Address Book <may cause some discomfort>", "6) Quit the Application" ) );

    private static  List<String> messageList = new ArrayList<>(Arrays.asList("Something very bad has just happened!", "Please choose what you'd like to do with the database: ", "Please come back again. " ) );



    /** Display the main menu */
    public static void displayMenu() {
        System.out.println(arrMenuOps.size());
        for(int i = 0; i < arrMenuOps.size(); i++)
        {
            System.out.println(arrMenuOps.get(i));
        }
    }

    /** Display the main menu */
    // implement display method passing in array list
    public static void displayMenu2(List arr) {
        System.out.println(arr.size());
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }

    public static List<String> getArrMenuOps() {
        return arrMenuOps;
    }

    /** Display the List entries **/
    /** Primary game control loop */
    public static void mainMenuLoop(){
        boolean flag = true;
        int userChoice;
        do {
            // display main menu
            /**  Call to display the main menu */
            userInteraction.displayMenu2(userInteraction.getArrMenuOps());


            // Todo: remove now that we know how to access the list contents and size
//            System.out.println(messageList.get(1));
//            System.out.println(getArrMenuOps().size());
            // collect input
            userChoice = Utilities.getInputNumber(messageList.get(1), getArrMenuOps().size());
            System.out.println(userChoice);
            // perform operations
            // allow for exit of program
            switch (userChoice) {

                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("ONe ");
                    break;
                case 2:
                    System.out.println("Two ");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("We have four");
                    break;
                case 5:
                    System.out.println("We have five");
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println(messageList.get(0));
                    break;
            }
        }while (flag); {
            // Todo: save address book
            System.out.println(messageList.get(2));
        }
    }

}
