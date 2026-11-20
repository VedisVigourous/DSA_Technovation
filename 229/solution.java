import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val1 = 0;
        int val2 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            if (num == val1) {
                count1++;
            } else if (num == val2) {
                count2++;
            } else if (count1 == 0) {
                val1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                val2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == val1) {
                count1++;
            } else if (num == val2) {
                count2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        int limit = nums.length / 3;

        if (count1 > limit) {
            res.add(val1);
        }
        if (count2 > limit) {
            res.add(val2);
        }

        return res;
    }
}
