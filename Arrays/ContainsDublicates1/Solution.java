/* Contains Duplicate
 Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 Example 1:
     Input: nums = [1, 2, 3, 3]
     Output: true
 Example 2:
    Input: nums = [1, 2, 3, 4]
    Output: false */

 
 
 /*
    Approach	                Time Complexity 	Space Complexity
    Brute Force (Nested Loops)	    O(n²)	            O(1)            
*/

//SOURCE CODE:
 // Import required package
import java.util.*;

public class Solution {
    // Method to check for duplicates
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    // Main method to run in Jupyter Notebook
    public static void main(String[] args) {
        Solution solution = new Solution();
        
  // Example test cases
        int[] nums1 = {1, 7, 2, 4, 5};  // No duplicates
        int[] nums2 = {1, 2, 3, 2, 5};  // Contains duplicates

        System.out.println("Test Case 1 (No Duplicates): " + solution.hasDuplicate(nums1)); 
        System.out.println("Test Case 2 (Has Duplicates): " + solution.hasDuplicate(nums2)); //
    }
}


