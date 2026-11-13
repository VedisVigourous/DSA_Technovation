class Solution {
    public int missingNumber(int[] nums) {
        cyclicSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        
        return nums.length;
    }

    public void cyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i];

            if (arr[i] < arr.length &&
                arr[i] != arr[correctIndex]) {

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            } else {
                i++;
            }
        }
    }
}
