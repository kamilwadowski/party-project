package pl.kamilwadowski.javakurs.data_structures.party;

public class Guest {

    private final String name;
    private final String meal;
    private final int phoneNumber;
    private final boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", meal='" + meal + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", isVegan=" + isVegan +
                '}';
    }

    public void displayGuestInformation(){
        System.out.println("Guest name: " + name + ", favourite meal: " + meal + ", phone number: " + phoneNumber + ", is vegan? " + (isVegan ? "Yes" : "No"));
    }

    public String getName() {
        return name;
    }



}
