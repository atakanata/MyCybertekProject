package repl;

import java.util.Scanner;

public class repl121 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
       // Given an array nums, calculate count of even numbers in nums (not their values!) and print out to console.
        //TODO: Write your code below
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
