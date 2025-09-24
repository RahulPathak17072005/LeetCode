class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int n1:nums1)set1.add(n1);
        for(int n2:nums2)set2.add(n2);
        Set<Integer> diff1=new HashSet<>(set1);
        diff1.removeAll(set2);
        Set<Integer> diff2=new HashSet<>(set2);
        diff2.removeAll(set1);
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>(diff1));
        ans.add(new ArrayList<>(diff2));
        return ans;

    }
}