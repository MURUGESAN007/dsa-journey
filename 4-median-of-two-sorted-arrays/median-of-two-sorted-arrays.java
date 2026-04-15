class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
int[] c = new int[nums1.length + nums2.length];
System.arraycopy(nums1, 0, c, 0, nums1.length);
System.arraycopy(nums2, 0, c, nums1.length, nums2.length);
java.util.Arrays.sort(c);

int n = c.length;
return n%2==0 ? (c[n/2-1]+c[n/2])/2.0 :c[n/2];
    }
}