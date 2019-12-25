package day32;

public class day32 {

    public static void main(String[] args) {
        printStringwDashInside("Hasan");
        printStringwDashInside("Akbar");
        printReverse("Hasan");
        printReverse("Banana Republic");
        printAtoZ();

    }

    public static void printStringwDashInside (String name) {

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i!= name.length()-1){
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void printReverse (String name) {
        for (int i = name.length()-1; i > -1 ; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
    public static void printAtoZ(){
        for (char iChar = 'A'; iChar<= 'Z'; iChar++){
            System.out.print(iChar+" ");
        }
        System.out.println();
    }

}
