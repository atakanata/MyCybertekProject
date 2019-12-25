package day33;

public class warmup2 {
    public static void main(String[] args) {

int sum = getSumFrom1toX(9);
        System.out.println("sum = " + sum);
    }
    public static int getSumFrom1toX (int x){

        int result = 0;
        //TODO: your code goes here
        for (int i = 0; i <=x ; i++) {
            result+=i;
        }
        return result;
    }


}
