class Solution {
    public void rotate(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length;
        if (steps == 0) {
            return;
        }
        reverse(arr, 0, length - 1);
        reverse(arr, 0, steps - 1);
        reverse(arr, steps, length - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
