class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(n == 0) {
            return ;
        }

        for(int i = 0; i<m; i++){
            if(nums1[i] != 0) {
                arr.add(nums1[i]);
            }
        }
        for(int i = 0; i<n; i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        for(int i = 0; i<arr.size(); i++) {
            nums1[i] = arr.get(i);
        }
       Arrays.sort(nums1);
    }
}