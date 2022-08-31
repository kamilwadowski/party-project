package pl.kamilwadowski.javakurs;



import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = sc.nextLine();
        if (!(name.isEmpty()) && (!name.endsWith("a") || name.equals("Barnaba") || name.equals("Kuba"))) {
            System.out.println("You are a man.");
        } else if (!name.isEmpty() || name.endsWith("a")) {
            System.out.println("You're a woman.");
        } else {
            System.out.println("The data has not been provided");
        }
        if (!(name.isEmpty())) {
            String f = name.substring(0, 1).toUpperCase();
            String rest = name.substring(1, name.length());
            System.out.println("Hi " + f + rest);
        }



    }
}

