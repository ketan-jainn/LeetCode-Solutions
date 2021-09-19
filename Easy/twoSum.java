// Solution 1 
// Time Complexity O(n^2) | Space Complexity O(1)

class Solution{
    public int[] twoSum(int[] nums, int target){
        for(int i = 0;i<nums.length;i++){
            int firstNumber = nums[i];
            for(int j = i+1; j< nums.length;j++){
                int secondNumber = nums[j];
                if(target == firstNumber + secondNumber){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}

// Solution 2
// Time Complexity ()