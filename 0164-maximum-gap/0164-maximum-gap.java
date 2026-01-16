class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length==1)
        {
            return 0;
        }
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int large= 0;
        while(j<nums.length)
        {
            int result = nums[j] - nums[i];
            if(result>large)
            {
                large = result;
            }
            i++;
            j++;
        }
        return large;
    }
}