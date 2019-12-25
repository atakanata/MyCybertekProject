package repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl122 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       // int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
int [] nums = {1,1,2,2,3,3,4};
        //TODO: write your code below

        Arrays.sort(nums);


        int dublicate=nums[nums.length-1];
        for (int i=0; i<nums.length-1;i+=2){
            if (nums[i]!=nums[i+1]){
                dublicate =nums[i];
                break;
            }
        }
        System.out.println(dublicate);



        for (int i = 0; i < nums.length; i++) {
            int equalCount = 0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[i] == nums[k]) {
                    equalCount++;
                }
            }
            if (equalCount == 1) {
                System.out.println(nums[i]);
                break;
            }
        }
    }
}
