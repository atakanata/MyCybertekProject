package day27;

import java.util.Arrays;

public class MultiDimentionalArrays {
    public static void main(String[] args) {
        int [] [] arr2D ={  {1,2,3,4}  , { 4,5,6 }        };

        System.out.println(arr2D[0][2]);
        System.out.println(arr2D[1][1]);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.deepToString(arr2D));



    }
}
