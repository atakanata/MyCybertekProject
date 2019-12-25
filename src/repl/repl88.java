package repl;

public class repl88 {
    public static void main(String[] args) {
        String word = "cat-cheetah-dog-catdog";
        int countOfCats = 0;
        int countOfDogs = 0;


        for (int i = 0; i < word.length()-2; i++) {
                if (word.substring(i,i+3).equalsIgnoreCase(  "cat")                ){
                    countOfCats++;
                }else if (word.substring(i,i+3).equalsIgnoreCase(  "dog")                ){
                    countOfDogs++;
                }
            }
        System.out.println( countOfCats==countOfDogs   );



    }
}
