// Move Xeros(283)

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i=index; i<nums.length;i++){
            nums[i] = 0;
        }
    }
}

//Missing Number(268)

class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int sumWithoutMissing = 0;
        for(int i=0; i<nums.length;i++){
             sumWithoutMissing += nums[i];
        }
        int sumWithMissing = (n *(n+1))/2;
        int missingNumber = sumWithMissing - sumWithoutMissing;
        return missingNumber; 
    }
}

//Build Array from Permutation(1920)

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int [n];
        for(int i=0; i<n;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

//
Concatenation of Array(1929)


class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
        }

        int index = nums.length;

        for(int i=0; i<nums.length;i++){
             ans[index] = nums[i];
             index++;
        }
        return ans;
    }
}