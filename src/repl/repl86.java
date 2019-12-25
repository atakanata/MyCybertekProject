package repl;

import java.util.Scanner;

public class repl86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter guest name:");
        String guests = input.next();
        System.out.println("Do you want to enter new guest name:");
        String response =input.next();

        while   ( response.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
            String name = input.next();
            guests =guests+ ", "+name;
            System.out.println("Do you want to enter new guest name:");
            response =input.next();
        }
        System.out.println("Guest's list: " + guests);
    }
}
