class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (digits[i] % 2 != 0) continue;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    if (digits[k] == 0) continue;
                    int num = (digits[k] * 100) + (digits[j] * 10) + digits[i];
                    set.add(num);
                }
            }
        }
        return set.size();
    }
}