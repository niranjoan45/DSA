// Longest element in an array 
class Solution {
    public int largestElement(int[] nums) {
      int max = nums[0];
      for(int i=1; i<nums.length; i++){
        if(nums[i] > max){
          max = nums[i];
        }
      }
      return max;
    }
}

//2nd longest element in an array

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

// Check array is sorted or not 
class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
       for(int i=0; i<nums.size()-1;i++){
         if(nums.get(i) > nums.get(i+1)){
            return false;
         }
       }
       return true;
    }
}

//Remove Duplicates 
class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
       for(int j=1;j<nums.length;j++){
        if(nums[i]!=nums[j]){
            i++;
            nums[i] = nums[j];
        }
       }
       return i+1;
    }
}

//Left Rotate the array by one
class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        nums[nums.length - 1] = temp;
    }
}
