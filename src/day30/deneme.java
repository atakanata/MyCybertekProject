package day30;

import day32.day32;

public class deneme {
    public static void main(String[] args) {

        day32.printAtoZ();
        printZtoA();

    }
    public static void printZtoA(){
        for (char iChar = 'Z'; iChar >= 'A' ; iChar--) {
            System.out.print(iChar+" ");
        }
        System.out.println();
    }
}
