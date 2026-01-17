//Find Pivot Element

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            sum+=nums[i];
        }
        int leftSum = 0;
        for(int i=0; i<nums.length;i++){
            if(leftSum==(sum-leftSum-nums[i]/*RightSum*/)){ 
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}


//Find the Highest Altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] prefix = new int[n];
        prefix[0] = gain[0];
        int max = 0;
        for(int i=1; i<n;i++){
              prefix[i] = prefix[i-1]+gain[i];
        }
        for(int i = 0; i<n; i++){
            if(prefix[i] >= max){
                max = prefix[i];
            }
        }
      return max;
    }
}

//Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) {
     int[] prefix = new int[nums.length];
     prefix[0] = nums[0];
     int sum = 0;
     for(int i=1; i<nums.length;i++){
       prefix[i] = prefix[i-1] + nums[i];
     }
     return prefix;
    }
}


//Range Sum Query

class NumArray {
          int[] prefix ;
    public NumArray(int[] nums) {
    
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return prefix[right];
        }else{
            return prefix[right] - prefix[left-1];
        }
    }
}


//Subarray sum equals k

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
     
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}

