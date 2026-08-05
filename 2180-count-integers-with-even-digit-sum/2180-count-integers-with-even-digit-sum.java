class Solution {
    public int countEven(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) ans += sumIsEven(i) ? 1: 0;
        return ans;
    }
    private boolean sumIsEven(int n) {
        return (String.valueOf(n).chars().map(Character::getNumericValue).sum() % 2 == 0);
    }
}