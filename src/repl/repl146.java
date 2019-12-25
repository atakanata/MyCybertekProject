package repl;

import java.util.Scanner;

public class repl146 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = s.nextInt();
        System.out.println("enter second number:");
        int num2 = s.nextInt();

        plus(num1,num2);
    }

    public static void plus(int num1,  int num2){

        //your code here
        System.out.println(num1+num2);

    }

}