class Solution {
    public int firstMissingPositive(int[] nums) {
        cyclicSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    public void cyclicSort(int [] arr) {
        int i = 0;
        while (i < arr.length) {
            int val = arr[i];
            if (val > 0 && val <= arr.length && (arr[i] != arr[val-1])) {
                int temp = arr[val-1];
                arr[val-1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}