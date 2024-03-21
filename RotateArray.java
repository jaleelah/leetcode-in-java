public class RotateArray {
    public void rotate(int[] nums, int k) {
        public void rotate(int[] nums, int k) {
            k = k % nums.length;
            int[] ref = new int[nums.length];
            for(int i = 0; i < nums.length; i++)
                ref[i] = nums[i];
            for(int i = 0; i < k; i++)
                nums[i] = ref[nums.length - (k - i)];
            for(int i = k; i < nums.length; i++)
                nums[i] = ref[i - k];
        }
    }
}
