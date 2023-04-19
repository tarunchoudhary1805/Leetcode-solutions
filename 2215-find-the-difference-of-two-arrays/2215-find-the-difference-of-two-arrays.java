class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
         list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            s1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            s2.add(nums2[i]);
        }
        for(Integer x : s2){
            if(!s1.contains(x)){
                list.get(1).add(x);
            }
        }
        for(Integer x : s1){
            if(!s2.contains(x)){
                list.get(0).add(x);
            }
        }
        return list;
    }
}