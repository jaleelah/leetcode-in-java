public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0 || len == 1)
            return len;
        int k = 1;
        for(int i = 1; i < len; i++) {
            if(nums[i] != nums[i - 1])
                k++;
        }
        int j = 0;
        for(int i  = 0; i < k; i++) {
            nums[i] = nums[j];
            while(nums[j] == nums[i] && j < len - 1)
                j++;
        }
        return k;
    }
}
