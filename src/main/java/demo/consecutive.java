package demo;

public class consecutive {
    //Input: nums = [2, 4, 1, 6, 8, 10, 3, 12]
    public static int findConsecutiveEven(int[] nums){
        int currentStreak =0;
        int maxStreak = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]%2==0){
                currentStreak++;
            }else {

                maxStreak = Math.max(currentStreak, maxStreak);
                currentStreak=0;
            }
        }
        return maxStreak;
    }
}
