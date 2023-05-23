class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num1 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            num1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
           if(num1.contains(nums2[i]) && !list.contains(nums2[i])){
               list.add(nums2[i]);
           }
        }
        int ans = list.size();
        int arr [] = new int[ans];
        
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}