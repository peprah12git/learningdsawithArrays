package demo;

import static demo.consecutive.findConsecutiveEven;

public  class Main {
    public static void main(String[] args) {

//Given a binary array nums containing only 0s and 1s,
//return the maximum number of consecutive 0's in the array.
        int[] nums = new int[]{2, 4, 1, 6, 8, 10, 3, 12};
        System.out.println(findConsecutiveEven(nums));

    }

//    public static int findMaximumConsecutives(int[] nums) {
//        // nums = [1,0,0,1,0,0,0,1]
//        int currentStrek = 0;
//        int macStreak = 0;
//        for (int i =0; i < nums.length; i ++){
//            if (nums[i]==0){
//                currentStrek ++;
//            }
//            if (nums[i]==1){
//                macStreak = Math.max(currentStrek, macStreak);
//                currentStrek=0;
//            }
//        }
//
//        return macStreak=Math.max(currentStrek,macStreak);
//    }
}