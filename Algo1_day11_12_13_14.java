//DAY11_1
class Solution {
    public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> combinations = new ArrayList<List<Integer>>();

		int[] combination = new int[k];
		for (int i = 0; i < k; i++) {
			combination[i] = i;
		}

		while (combination[k - 1] < n) {
			List<Integer> comblist = new ArrayList<Integer>();
			for(int i=0; i<combination.length; i++) {
				comblist.add(combination[i]+1);
			}
			combinations.add(comblist);
			int t = k - 1;
			while (t != 0 && combination[t] == n - k + t) {
				t--;
			}
			combination[t]++;
			for (int i = t + 1; i < k; i++) {
				combination[i] = combination[i - 1] + 1;
			}
		}

		return combinations;        
    }
}


 //DAY11_2
 /*class Solution {
    public List<List<Integer>> permute(int[] nums) {
   List<List<Integer>> list = new ArrayList<>();
   backtrack(list, new ArrayList<>(), nums);
   return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
   if(tempList.size() == nums.length){
      list.add(new ArrayList<>(tempList));
   } else{
      for(int i = 0; i < nums.length; i++){
         if(tempList.contains(nums[i])) continue; // element already exists, skip
         tempList.add(nums[i]);
         backtrack(list, tempList, nums);
         tempList.remove(tempList.size() - 1);
      }
   }
}
}*/



//DAY11_3
/*class Solution {
    public List<String> letterCasePermutation(String S) {
        List<StringBuilder> ans = new ArrayList();
        ans.add(new StringBuilder());

        for (char c: S.toCharArray()) {
            int n = ans.size();
            if (Character.isLetter(c)) {
                for (int i = 0; i < n; ++i) {
                    ans.add(new StringBuilder(ans.get(i)));
                    ans.get(i).append(Character.toLowerCase(c));
                    ans.get(n + i).append(Character.toUpperCase(c));
                }
            } else {
                for (int i = 0; i < n; ++i)
                    ans.get(i).append(c);
            }
        }

        List<String> finalans = new ArrayList();
        for (StringBuilder sb: ans)
            finalans.add(sb.toString());
        return finalans;
    }
}*/



//DAY12_1
/*class Solution {
    public int climbStairs(int n) {
        if(n <= 3){
            return n;
        }
        int a = 3, b = 2;
        for(int i = 0; i < n-3; i++){
            a = a + b;
            b = a - b;
        }
        return a;
    }
}*/

//DAY12_2
/*class Solution {
        public int rob(int[] nums) {

            if (nums == null || nums.length == 0) {
                return 0;
            }

            // dp[i] means until i, max possible amount
            int[] dp = new int[nums.length + 1];

            dp[0] = 0;
            dp[1] = nums[0];

            for (int i = 2; i <= nums.length; i++) {
                // 2 cases: rob current house, not rob current
                dp[i] = Math.max(nums[i - 1] + dp[i - 2], dp[i - 1]);
            }

            return dp[nums.length];
        }
    }*/

//DAY12_3
/*class Solution {
  public int minimumTotal(List<List<Integer>> triangle) {
    for (int i = triangle.size() - 2; i >= 0; --i)
      for (int j = 0; j <= i; ++j)
        triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j),
                                                                 triangle.get(i + 1).get(j + 1)));
    return triangle.get(0).get(0);
  }
}*/



//DAY13_1
/*public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
}*/


//DAY13_2
/*public class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    int ans = 0;

    for (int i = 0; i < 32; ++i)
      if (((n >> i) & 1) == 1)
        ++ans;

    return ans;
  }
}*/

//DAY14_1
/*public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        for (int i = 0; i < 16; i++) { 
            n = swapBits(n, i, 32 - i - 1); 
        } 
        return n; 
    } 
    public int swapBits(int n, int i, int j) { 
        int a = (n >> i) & 1;
        int b = (n >> j) & 1;
        if ((a ^ b) != 0) {
            return n ^= (1 << i) | (1 << j);
        }

        return n;
    }
}*/

//DAY14_2
/* public class Solution {

    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];
        }
        return nums[0];
    }
}*/
