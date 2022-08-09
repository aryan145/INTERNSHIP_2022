class Algo1_day1_1 {
    public int search(int[] nums, int target) {
         if (nums == null || nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) {
        return -1;
    }

    int l = 0, r = nums.length - 1, m = l + ((r - l) / 2);
    while (l < r) {
        if (target == nums[m]) {
            return m;
        } else if (target < nums[m]) {
            // move left
            r = m;
        } else {
            // move right
            l = m + 1;
        }
        m = l + ((r - l) / 2);
    }

    return target == nums[m] ? m : -1;
}
        
    }
