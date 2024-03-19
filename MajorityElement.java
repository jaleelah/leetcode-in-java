public class MajorityElement {
    public int majorityElement(int[] nums) {
        int current = nums[0]; int freq = 1;
        for(int i = 1; i < nums.length; i++) {
            if(freq <= 0) {
                current = nums[i]; 
                freq = 1;
            }
            else if(nums[i] == current)
                freq++;
            else
                freq--;
        }
        return current;
    }
}
