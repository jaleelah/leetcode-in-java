public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1)
            return nums.length;
        int i = 0;
        for(int k = 0; k < nums.length; k++) {
            while(nums[i] == nums[k] && i < nums.length - 1) {
                i++;
            }
            if(i == k + 2) {
                k++; // this is on purpose; want to increment twice if necessary
                continue;
            }
            else if(i == k + 1)
                continue;
            else {

            }
        }
        return k;
    }
}