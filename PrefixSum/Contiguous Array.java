// pehle map.put(0,-1) likh

// phir diff

// phir containsKey(diff)

// phir Math.max
REVISION ----------------------------------------

class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int zero = 0;
        int one = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero++;
            } else {
                one++;
            }

            int diff = zero - one;
            if (map.containsKey(diff)) {
                result = Math.max(result, i - map.get(diff));
            } else {

                map.put(diff, i);
            }

        }
        return result;

    }
}

