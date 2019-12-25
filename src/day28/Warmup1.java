package day28;

public class Warmup1 {
    public static void main(String[] args) {
        int [][] excel = new int [][] { {78,54,100,84},{33,44,77,123},{12,88,52,76},{67,33,98,67},{12,88,52,45},{67,33,98,34} };

        for (int i = 0; i < excel.length; i++) {
            System.out.println("Row index number "+ i +" has "   + excel[i].length);
        }
        System.out.println(excel.length);


        for (int [] eachRow:excel
             ) {
            for (int eachCell:eachRow
                 ) {
                System.out.print(eachCell+" ");
            }
            System.out.println();
        }



    }
}
