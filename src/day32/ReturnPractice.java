package day32;

public class ReturnPractice {

    public static void main(String[] args) {

        int doubledNumber = doubletheValue(10);
        System.out.println("doubledNumber = " + doubledNumber);
        System.out.println( add2numbers(7,63)    );
        System.out.println(  divide(22,7)       );
        System.out.println(divide(1,0)  );



    }
    public static int add2numbers(int num1, int num2){

        return num1+num2;
    }


    public static int doubletheValue (int num){

        return num *2;
    }
    public static double divide(  double num1, double num2  ){

        if (num2==0){
            return 0;
        }else {

            return num1 / num2;
        }
    }

}
