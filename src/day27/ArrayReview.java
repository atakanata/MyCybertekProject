package day27;

import java.util.Arrays;

public class ArrayReview {

    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60,-1,80,878,87089,987898,989,0000,7876};

        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x]+" ");
        }
        int max = arr[0];

        //Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("max = " + max);

        int min = arr[0];
        for (int y = 0; y < arr.length; y++) {
            if (min>arr[y]){
                min = arr[y];
            }
        }
        System.out.println("min = " + min);

        int secondMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==min){
                continue;
            }
            if (secondMin>arr[i]){
                secondMin=arr[i];
            }
        }
        System.out.println("secondMin = " + secondMin);




    }
}
