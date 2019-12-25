package repl;

public class repl150 {
    public static void printHollowRect(int num) {

        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num; j++) {
                if (i==0){
                    System.out.println("*");
                }else if ( i>0 && i<num-1){

                }
            }


        }



    }

    public static void main(String[] args) {
        printHollowRect(5);

    }




}