class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i]))
            {
                set2.add(nums2[i]);
            }
        }
        System.out.print(set2);
        int[] arr=new int[set2.size()];
        int index=0;
        for(int i:set2)
        {
            arr[index]=i;
            index++;
        }
        return arr;
    }
}