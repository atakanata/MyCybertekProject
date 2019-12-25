package day32;

public class Secondwarmup {
    public static void main(String[] args) {
        printAlphabetinRange('a','f');
        printAlphabetinRange('a','Z');
        printAlphabetinRange('A','z');
        Secondwarmup.printAlphabetinRange('A','A');


    }

    public static void printAlphabetinRange (char beginning, char ending){
        if (beginning<ending) {
            System.out.println("We need to increment from " + beginning + " till " + ending);
            for (char iChar = beginning; iChar <=ending ; iChar++) {
                System.out.print(iChar+" ");
            }
            System.out.println();
        }else if (beginning>ending){
            System.out.println("We need to decrement from "+beginning+" till "+ending);
            for (char iChar = beginning; iChar>= ending; iChar--){
                System.out.print(iChar+" ");
            }
            System.out.println();
        }else {
            System.out.println("They are the same character!");
        }
    }
}
