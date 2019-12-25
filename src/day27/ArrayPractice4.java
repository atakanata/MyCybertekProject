package day27;

import java.util.Arrays;

public class ArrayPractice4 {
    public static void main(String[] args) {

        int [][] arr2D = {  {1,2,3}, {4,5,6}};
        int [][][] arr3D = { { {7,8,9},    {10,11,12}   }  ,      {   {13,14,15},     {16,17,18}     }    };


        System.out.println( arr3D[1][0][2]        );

        System.out.println(Arrays.deepToString(arr3D)    );

        System.out.println(Arrays.deepToString(arr3D[1]   ));


        System.out.println(  Arrays.toString( arr3D[0][1]  )        );


        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    System.out.print(arr3D[i][j][k]+" ");
                }
            }

        }





    }
}
