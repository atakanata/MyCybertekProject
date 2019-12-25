package day27;

import java.util.Arrays;

public class MultiDPreactice2 {
    public static void main(String[] args) {

        int [] [] ages = {   {10}, {12,13,425,25,23,53,35,333}, {23,232,2,253,353,34}    };

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                if (ages[i][j]% 2!=0){
                    continue;
                }
                System.out.print(ages[i][j]+" ");
            }
        }


        for (int [] each:ages
             ) {
            for (int eachElement:each
                 ) {
                System.out.println("eachElement = " + eachElement);
            }

            //System.out.println("each = " + Arrays.toString(each));
        }

        int min = ages[0][0];
        for (int [] eachd1array:ages
             ) {
            for (int each:eachd1array
                 ) {
                if (min > each){
                    min = each;
                }
            }
        }
        System.out.println("min = " + min);

        int max = ages[0][0];
        for (int i = 0; i < ages.length; i++) {


        }







    }
}
