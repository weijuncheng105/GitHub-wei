//�൱�ڼ���һ��Լ����������һ�Һ����һ�Ҳ���ͬʱ͵;
public class Solution {

    public int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        else if(nums.length==1) return nums[0];
        else if(nums.length==2) return Math.max(nums[0], nums[1]);
        else{
        	int res = 0;
        	//��һ���������һ��������ͬʱȡ��
        	//�����μ��㣬��һ�δ��±�0�������ڶ�����;
        	//�ڶ�������±�1�����һ����
        	int maxsum[] = new int[nums.length-1];
        	//��һ��
        	maxsum[0] = nums[0];
        	maxsum[1] = Math.max(nums[0], nums[1]);
        	for(int i = 2;i<maxsum.length;i++){
        		maxsum[i] = Math.max(maxsum[i-1],maxsum[i-2]+nums[i]);
        	}
        	res = maxsum[maxsum.length-1];
        	//�ڶ���
        	maxsum[0] = nums[1];
        	maxsum[1] = Math.max(nums[1], nums[2]);
        	for(int i = 2;i<maxsum.length;i++){
        		maxsum[i] = Math.max(maxsum[i-1],maxsum[i-2]+nums[i+1]);
        	}
        	res = Math.max(res,maxsum[maxsum.length-1]);
        	return res;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nums[] = {1,3,1,3,100};
        System.out.println(new Solution().rob(nums));
	}

}
