package pl.kamilwadowski.javakurs.data_structures.party;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Party party = new Party();
        Scanner sc = new Scanner(System.in);
        boolean shouldContinue = true;


            do {

                System.out.println("Choose your options:");
                System.out.println("1: View guests");
                System.out.println("2: Add a guest");
                System.out.println("3: Display the dishes");
                System.out.println("4: Find by phone number");
                System.out.println("5: Exit");

                try {
                int userChoice = sc.nextInt();
                switch (userChoice) {
                    case 1 -> party.viewGuests();
                    case 2 -> party.addGuest();
                    case 3 -> party.displayDishes();
                    case 4 -> party.findGuestByPhoneNumber();
                    case 5 -> shouldContinue = false;

                }
                if (userChoice < 1 || userChoice > 5) {
                    System.out.println("You gave the wrong number");
                }
                } catch (InputMismatchException e) {
                    System.out.println("Input mismatch");
                    shouldContinue = false;
                }
            } while (shouldContinue);

            String userChoiceSaveToFile;
        System.out.println("Do you want to save the file? (Y/N)");
        userChoiceSaveToFile = sc.next();
        if(userChoiceSaveToFile.equals("Y") || userChoiceSaveToFile.equals("y")){
            party.saveToFile();
        }
        else {
            System.out.println("Goodbye.");
        }





    }
}
