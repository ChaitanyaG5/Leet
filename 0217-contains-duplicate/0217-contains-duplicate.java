class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int i=0;
        // while(i+1<nums.length)
        // {
        //     if(nums[i]==nums[i+1])
        //     {
        //         return true;
        //     }
        //     i++;
        // }
        // return false;

        Set<Integer> set = new HashSet<>();
        for(int a:nums)
        {
            set.add(a);
        }

        if(set.size()==nums.length)
        {
            return false;
        }
        return true;
    }
}