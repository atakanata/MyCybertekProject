package repl;

import java.util.Scanner;

public class repl148 {

    public static void cube(int n)
    {
        //your code here
        System.out.print(n*n*n);
    }//end cube

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        cube(n);

    }
}