class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combinations(n, 0, temp, res, k);
        return res;
    }
    
    private void combinations(int n, int start, List<Integer> temp, List<List<Integer>> res, int k) {
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i=start; i<=n; i++) {
            temp.add(i);
            combinations(n, i+1, temp, ans, len);
            temp.remove(temp.size() - 1);
        }
    }
} 
