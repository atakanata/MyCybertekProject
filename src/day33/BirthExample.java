package day33;

import javax.swing.text.rtf.RTFEditorKit;
import java.util.Arrays;

public class BirthExample {
    public static void main(String[] args) {

//        int myage = ReturnAge(1901);
//        System.out.println("myage = " + myage);

        int[] arr = {1942, 1985, 1952, 1842, 2004, 2015, 1422, 1963, 1950};
        int[] arr2 = new int [arr.length];

        //for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr2[j]= ReturnAge(arr[j]);
            }
//            for (int each : arr
//            ) {
//                arr2[i]= ReturnAge(each);
//            }
       // }
        System.out.println(Arrays.toString(arr2));
    }
    public static int ReturnAge (int byear){
if (byear<2019 &&byear>1900) {
    return 2019 - byear;
}else{
    return 0;
}

    }

}
