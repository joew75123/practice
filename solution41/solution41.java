package solution41;

public class solution41 {
    public int firstMissingPositive(int[] nums) {
        //负数变n+1
        int length=nums.length;
        for(int i=0; i<length; i++){
            if(nums[i]<=0){
                nums[i]=length+1;
            }
        }
        for(int i=0; i<length; i++){
            int num=Math.abs(nums[i]);
            if(num>0&&num<=length){
                //int index=nums[i];
                nums[num-1]=-(Math.abs(nums[num-1]));
            }
        }
        for(int i=0; i<length; i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return length+1;
    }
}
