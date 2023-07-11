class Solution {
    public int solve(int n, int i){
        if(i*i < n){
            return (i*i + solve(n, i+1));
        }else{
            return 0;
        }
    }
    public int punishmentNumber(int n) {
        int ans = solve(n,1);
        return ans;
    }
}
