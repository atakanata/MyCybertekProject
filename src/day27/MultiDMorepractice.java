package day27;

import java.util.Arrays;

public class MultiDMorepractice {
    public static void main(String[] args) {

        String [] [] names = {    {"Rukshana", "Ghoya" } ,    {  "Hasan", "Tetiana"     }            };
        names [1][1] = "Dilshat";
        //System.out.println(names[1][0]);

        for (int i = 0; i < names.length ;i++) {
            //System.out.println(Arrays.toString(names[i]));

            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]+" ");
            }
        }






//        int [] [] [] columns = { {{3,1}},{{241},{412}  }};
//        System.out.println(Arrays.deepToString(columns));
    }
}
