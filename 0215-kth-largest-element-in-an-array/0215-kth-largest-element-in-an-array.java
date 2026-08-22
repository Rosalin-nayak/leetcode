class Solution {
    public int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
}