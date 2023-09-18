package Arrayss;

//Question for the probelm : https://leetcode.com/problems/jump-game-ii/description/
// /solution fo rhte proble using greedy approach below :
public class JumpGame2 {

    public static int minjumps(int[] nums) {

        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;

    }

    public static void main(String[] args) {

        int[] nums = { 2, 3, 1, 1, 4, 4, 6, 1, 6, 7, 2 };
        System.out.println("the output is : " + minjumps(nums));
    }
}
