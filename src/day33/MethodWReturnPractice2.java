package day33;

import java.util.Arrays;

public class MethodWReturnPractice2 {
    public static void main(String[] args) {
        //System.out.println(getDay(2) );

      //  int [] arr = new int[7];
        //arr[0]=1;
        for (int i = 1; i < 9; i++) {
            System.out.println(  getDay(i)  );
        }





    }

    public static String getDay(int day) {
        String dayn;

        switch (day) {
            case 1:
                dayn = "Monday";
                break;
            case 2:
                dayn = "Tuesday";
                break;
            case 3:
                dayn = "Wednesday";
                break;
            case 4:
                dayn = "Thursday";
                break;
            case 5:
                dayn = "Friday";
                break;
            case 6:
                dayn = "Saturday";
                break;
            case 7:
                dayn = "Sunday";
                break;
            default:
                dayn = "Invalid";
        }
        return dayn;
    }

}