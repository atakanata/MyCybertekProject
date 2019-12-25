package repl;

import java.util.Scanner;

public class repl79 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String firstIndex = String.valueOf(word.charAt(0));
        String lastIndex = String.valueOf(word.charAt(word.length()-1 ));

        if(firstIndex.equalsIgnoreCase("x") || lastIndex.equalsIgnoreCase("x")           ){

            System.out.println( word.substring( 1  ,word.length()-1    )             );

        }else if (firstIndex.equals("x") ){

            System.out.println( word.substring (1)        );

        }else if ( lastIndex.equals("x") ) {

            System.out.println( word.substring( 0,  word.length()-1  )          );

        }


        else {

            System.out.println(word);
        }



    }
}