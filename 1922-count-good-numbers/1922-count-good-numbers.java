class Solution {
    public int countGoodNumbers(long n) {
        long MOD = 1_000_000_007;

        long evenCount = (n + 1) / 2; // positions 0,2,4,...
        long oddCount = n / 2;        // positions 1,3,5,...

        long evenWays = modPow(5, evenCount, MOD);
        long oddWays = modPow(4, oddCount, MOD);

        return (int)((evenWays * oddWays) % MOD);
    }

    private long modPow(long base, long exp, long MOD) {
        long result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }
}
