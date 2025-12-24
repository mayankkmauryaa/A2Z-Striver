class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer> lane = new ArrayList<>();
            long ans = 1;
            lane.add(1);
            for (int col = 1; col <= row; col++) {
                ans = ans * (row - col + 1) / col; // triangle = (row - col) / col
                lane.add((int) ans);
            }
            triangle.add(lane);
        }
        return triangle;
    }
}
