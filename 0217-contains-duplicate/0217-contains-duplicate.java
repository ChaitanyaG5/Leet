class Solution {
    public boolean containsDuplicate(int[] nums) {
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