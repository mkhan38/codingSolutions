class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp = target;
        
        int indices[] = new int[2];
        
        for(int i = 0;i<nums.length;i++){
            target -= nums[i];

            for(int j = i+1;j<nums.length;j++){
                if(target==nums[j]){
                    indices[0] = i;
                    indices[1] = j;
                }               
            }
            target = temp;
        }
        return indices;
    }
}
