class Solution {
    public int countPrimes(int n) {
        if(n<2)
        {
            return 0;
        }
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;
        int count = 0;

        for(int i=2;i<n;i++)
        {
            int j=2;
            if(arr[i]==true)
            {
                while((i*j)<n)
                {
                    arr[i*j] = false;
                    j++;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==true)
            {
                count++;
            }
        }
        return count;
    }
}