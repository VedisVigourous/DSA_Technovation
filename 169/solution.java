class Solution {
    public int majorityElement(int[] nums) {
        int a = 0;
        int b = 0;

        for (int c : nums) {
            if (a == 0) {
                b = c;
            }
            a += (c == b) ? 1 : -1;
        }

        return b;
    }
}