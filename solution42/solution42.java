package solution42;
/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 */
public class solution42 {
    public int trap(int[] height) {
        //双指针
        int length=height.length;
        int left=0, right=length-1;
        int max_left=0, max_right=0;
        int res=0;
        if(length<3){return 0;}
        while(left<right){
            //右边为固定边界，移动左边
            if(height[left]<height[right]){
                if(height[left]>=max_left){
                    max_left=height[left];
                }else{
                    res+=(max_left-height[left]);
                }
                ++left;
            }
            //左边为固定边界，移动右边
            else{
                if(height[right]>=max_right){
                    max_right=height[right];
                }else{
                    res+=(max_right-height[right]);
                }
                ++right;
            }
        }

        return res;
    }
}