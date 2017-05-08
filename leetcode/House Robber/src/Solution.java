
public class Solution {

    public int rob(int[] nums) {
        if(nums==null||nums.length==0)
        	return 0;
        int[] maxsum = new int[nums.length];
        maxsum[0] = nums[0];
        if(nums.length == 1) return maxsum[0];
        maxsum[1] = Math.max(maxsum[0], nums[1]);
        for(int i = 2;i<nums.length;i++){
        	maxsum[i] = Math.max(maxsum[i-1], maxsum[i-2]+nums[i]);
        }
        return maxsum[nums.length-1];
        	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []nums={1,2,50,3,2,100};
        System.out.println(new Solution().rob(nums));
	}

}
