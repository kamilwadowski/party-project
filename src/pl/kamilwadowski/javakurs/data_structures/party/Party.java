package pl.kamilwadowski.javakurs.data_structures.party;

import java.io.*;
import java.util.*;

public class Party {

    List<Guest> guests = new ArrayList<>();
    Set<String> meals = new HashSet<>();
    Map<Integer, Guest> phoneToGuest = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void addGuest(){
        try {
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Enter your favourite meal:");
            String meal = sc.nextLine();
            System.out.println("Enter your phone number:");
            int phoneNumber;
            do {
                phoneNumber = Integer.parseInt(sc.nextLine());
                if (phoneNumber < 9999) {
                    System.out.println("Number too short! Try again:");
                }
            } while (phoneNumber < 9999 );
            System.out.println("Are you vegan? (Y/N)");
            boolean isVegan;
            String isVeganString = sc.nextLine();
            isVegan = isVeganString.equals("Y") || isVeganString.equals("y");

        Guest guest = new Guest(name, meal, phoneNumber, isVegan);
        guests.add(guest);
        phoneToGuest.put(phoneNumber, guest);
        meals.add(meal);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Wrong number format specified ");

        }
    }
    public void viewGuests(){
        for(Guest guest : guests){
            guest.displayGuestInformation();
        }
    }
    public void displayDishes(){
        for(String meal : meals){
            System.out.println(meal);
        }
    }
    public void findGuestByPhoneNumber(){
        System.out.println("Enter your phone number:");
        Integer phoneNumber = sc.nextInt();
        Guest guest = phoneToGuest.get(phoneNumber);
        guest.displayGuestInformation();
    }

    public void saveToFile(){

        try {
            File f = new File("C:\\Users\\kamil\\OneDrive\\Desktop\\Party\\partyList.txt");
            if (f.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exist.");
            }
            if (f.canWrite()) {
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(guests.toString());
                bw.newLine();
                bw.close();
                if(f.canRead()){
                    Scanner sc = new Scanner(f);
                    while (sc.hasNext()){
                        System.out.println(sc.nextLine());
                    }
                }
                fw.close();
                bw.close();
                sc.close();
            } else {
                System.out.println("File cannot written.");
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }







}
