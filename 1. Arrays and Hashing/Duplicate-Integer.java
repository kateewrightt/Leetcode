// Duplicate Integer
// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

// Example 1:

// Input: nums = [1, 2, 3, 3]

// Output: true
// Example 2:

// Input: nums = [1, 2, 3, 4]

// Output: false

import java.util.HashMap;

public class Solution {

    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] testArray = {1, 2, 3, 4, 1};  // Example test array
        boolean result = solution.hasDuplicate(testArray);
        
        System.out.println("Has Duplicate: " + result);  // Output: true
    }
}
