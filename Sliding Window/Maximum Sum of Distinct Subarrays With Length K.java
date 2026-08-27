// brute Code 

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long max = 0;

        for (int i = 0; i <= n - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            boolean isDup = false;

            long sum = 0;

            for (int j = i; j <= i + k - 1; j++) {
                if (set.contains(nums[j])) {
                    isDup = true;
                    break;
                }

                set.add(nums[j]);
                sum = sum + nums[j];
            }

            if (!isDup) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}


// Revision 
i = window ko move karta hai
j = current window ke elements ko traverse karta hai
set = duplicate check karta hai
sum = current window ka sum
max = ab tak ka maximum valid window sum








    

 // Optimise Code 


class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;
        long max = 0;
        long sum = 0;
        int dups = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }

            map.put(nums[i], map.get(nums[i]) + 1);
            sum = sum + nums[i];

            if (map.get(nums[i]) > 1) {
                dups++;
            }
        }
        if (dups == 0) {
            max = Math.max(sum, max);
        }

        for (int i = k; i < n; i++) {
            int numsadd = nums[i];
            int numsrem = nums[i - k];

            if (!map.containsKey(numsadd)) {
                map.put(numsadd, 0);
            }

            map.put(numsadd, map.get(numsadd) + 1);

            sum = sum + numsadd;

            if (map.get(numsadd) > 1) {
                dups = dups + 1;
            }
            if (map.get(numsrem) > 1) {
                dups--;
            }

            map.put(numsrem, map.get(numsrem) - 1);

            sum = sum - numsrem;

            if (dups == 0) {
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}




// Revision 


🟢 PART 1 — First Window
k → Window ka fixed size.
for (i = 0; i < k; i++) → First k elements ki window banata hai.
map → Elements ki frequency store karta hai.
sum → First window ka total sum.
map.get(nums[i]) > 1 → Duplicate mila.
dups++ → Duplicate count increase.
dups == 0 → First window valid hai.
Valid window par max update hota hai.

Flow:

First k elements
      ↓
  Map + Sum
      ↓
Duplicate check
      ↓
 dups == 0 ?
      ↓
  max update
🔵 PART 2 — Sliding Window
i = k → First window ke baad next element se start.
nums[i] → New element → ADD.
New element ko map + sum mein add karo.
Agar new element already present hai → dups++.
nums[i-k] → Oldest element → REMOVE.
Remove karne se pehle frequency check karo.
Agar uski frequency > 1 hai → dups--.
Map ki frequency decrease karo.
Old element ko sum se minus karo.
dups == 0 → Current window valid.
Valid window par max update karo.
i++ → Window next position par move.
