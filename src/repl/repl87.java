package repl;

public class repl87 {
    public static void main(String[] args) {
        int inhabitants =6;


        int day=0;
            while (inhabitants!=0){
                System.out.println(  "Day "+day+" ["+inhabitants+"]"          );
                day++;
                inhabitants=inhabitants/2;

            }
        System.out.println("---- EXTINCT ----");

    }
}
