class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] n1 = new int[m];
        for(int i = 0; i < m; i++)
            n1[i] = nums1[i];
        int a = 0; int b = 0; int i = 0;
        while(i < (m + n)) {
            if(n == 0 || b >= n || a < m && n1[a] <= nums2[b]) {
                nums1[i] = n1[a];
                a++;
            }
            else if (m == 0 || a >= m || b < n && nums2[b] <= n1[a]){
                nums1[i] = nums2[b];
                b++;
            }
            i++;
        }
    }
}