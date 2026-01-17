class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 1;

        while (i > 0 && nums[i - 1] >= nums[i]) {
            i--;
        }

        if (i > 0) {
            int j = n - 1;
            while (nums[j] <= nums[i - 1]) {
                j--;
            }
            swap(nums, i - 1, j);
        }

        reverse(nums, i, n - 1);
    }

    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l++, r--);
        }
    }
}
