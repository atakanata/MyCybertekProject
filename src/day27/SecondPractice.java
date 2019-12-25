package day27;

public class SecondPractice {

    public static void main(String[] args) {

        int [] nums = { 100,1000,999,42535,4353,35353};
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max<nums[i]){
                max =nums[i];
            }
        }
        System.out.println("first max = " + max);

        int secondMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (secondMax< nums[i] && nums[i]!=max){
                secondMax=nums[i];
            }
        }
        System.out.println("second Max = " + secondMax);
    }
}
