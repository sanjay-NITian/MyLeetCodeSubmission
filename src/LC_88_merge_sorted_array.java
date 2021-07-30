public class LC_88_merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        int i = m-1;
        int j=n-1;
        int x=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[x--]=nums1[i--];
            }else{
                nums1[x--]=nums2[j--];
            }
        }
        if(i==-1){
            while(j>=0){
                nums1[x--]=nums2[j--];
            }
        }
    }
}
