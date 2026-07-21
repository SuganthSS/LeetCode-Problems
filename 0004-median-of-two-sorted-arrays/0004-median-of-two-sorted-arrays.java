class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] arr=new int[n];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        if(n%2==0)
        {
            double a1=arr[n/2];
            double a2=arr[n/2-1];
            double ans=(a1+a2)/2;
            return ans;
        }
        else
        {
            return arr[n/2];
        }
    }
}