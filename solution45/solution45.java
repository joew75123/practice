package solution45;
/*
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [2,3,0,1,4]
Output: 2

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/jump-game-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution45 {
    public int jump(int[] nums) {
        int steps=0, length=nums.length;
        int max_far=0, edge=0;
        if(length==0){
            return 0;
        }
        for(int i=0;i<length-1;i++){
            max_far=Math.max(max_far, i+nums[i]);
            if(i==edge){
                edge=max_far;
                steps++;
            }
        }
        return steps;
    }
}