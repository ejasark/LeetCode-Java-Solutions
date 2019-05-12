class Solution {
    public static List<List<Integer>> subsets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        computeSubsets(arr, res, temp, 0);
        return res;
    }

    private static void computeSubsets(int[] nums, List<List<Integer>> res, List<Integer> temp, int start) {
        res.add(new ArrayList<>(temp));

        for (int i=start; i<arr.length; i++) {
            temp.add(arr[i]);
            computeSubsets(arr, res, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
