class Solution {
    public boolean lemonadeChange(int[] bills) {
        int change_5 =0;
        int change_10 =0;
        int change_20 =0;
        int i = 0;
        while(i<bills.length)
        {
            if(bills[i]==5)
            {
                change_5++;
            }
            else if(bills[i]==10 && change_5>0)
            {
                change_10++;
                change_5--;
            }
            else if(bills[i]==20 && (change_10>0 && change_5>0)){
                change_20++;
                change_10--;
                change_5--;
            }
            else if(bills[i]==20 && change_5>=3)
            {
                change_20++;
                change_5-=3;
            }
            else{
                return false;
            }
            i++;
        }

        return true;
    }
}