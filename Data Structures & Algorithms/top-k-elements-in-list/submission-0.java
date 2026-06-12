class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[2001];

        for (int num : nums) {
            freq[num + 1000]++;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                list.add(i - 1000);
            }
        }

        list.sort((a, b) -> freq[b + 1000] - freq[a + 1000]);

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}