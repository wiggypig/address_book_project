import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        int opOne;


        // Add first entry to AddressBook directly - implementation is static
        AddressBook.addEntry(
                new Entry("Scott",
                        "Horne",
                        "5555555",
                        "develops@scottiehorne.com") );
        AddressBook.addEntry(
                new Entry("Hobbs",
                        "Horne",
                        "3185555432",
                        "hobbs@calvinandhobbs.com") );

/*
//       Call to display the main menu
        userInteraction.displayMenu2(userInteraction.getArrMenuOps());
*/

//        userInteraction.displayMenu2(AddressBook.getEntryList());
//        opOne = Utilities.getInputNumber(message1);
        userInteraction.mainMenuLoop();
//        System.out.println(opOne);
    }

    /** Handles the mainMenu */


}