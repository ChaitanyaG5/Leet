class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max = count;
        int i =0;
        while(i<s.length())
        {
            if(s.charAt(i)=='(')
            {
                count++;
            }
            else if(s.charAt(i)==')')
            {
                count--;
            }
            if(count>max)
            {
                max = count;
            }
            i++;
        }
        return max;
    }
}