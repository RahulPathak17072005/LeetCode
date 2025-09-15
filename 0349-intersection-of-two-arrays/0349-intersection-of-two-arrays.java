class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        Set<Integer> s=new HashSet<>();
        for(int num:nums2){
            if(set.contains(num)){
                s.add(num);
            }
        }
        int idx=0;
        int[] res=new int[s.size()];
        for(int n:s){
            res[idx++] =n;
        }
        return res;
    }
}