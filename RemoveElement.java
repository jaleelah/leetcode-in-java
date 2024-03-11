public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for(int i = k - 1; i >= 0; i--) {
            if(nums[i] == val)
                k--;
        }
        int finder = nums.length - 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val)
                continue;
            else {
                boolean replaced = false;
                while(!replaced && finder >= k) {
                    if(nums[finder] != val) {
                        nums[i] = nums[finder];
                        replaced = true;
                    }
                    finder--;
                }
            }
        }
        return k;
    }
}
