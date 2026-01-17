//Maximum Average Subarray I

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        int maxSum = sum;

        for(int i=k; i<nums.length;i++){
            sum += nums[i];
            sum -= nums[i-k];
            maxSum = Math.max(sum,maxSum);
        }
        return (double) maxSum/k;
    }
}

//Minimum Size Subarray Sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                minLen = Math.min(minLen, right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen ;
    }
}


//Minimum Size Subarray Sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                minLen = Math.min(minLen, right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen ;
    }
}


//Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String pref = strs[0];
        int prefLen = pref.length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
                prefLen--;
                if (prefLen == 0) {
                    return "";
                }
                pref = pref.substring(0, prefLen);
            }
        }

        return pref;        
    }
}


//Product of Array Except Self

class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] leftProduct = new int[nums.length];
    int[] rightProduct = new int[nums.length];  
    for(int i=0,temp=1; i<nums.length;i++){
       leftProduct[i] = temp;
       temp *= nums[i];
    }        
    for(int i=nums.length-1,temp=1; i>=0;i--){
        rightProduct[i] = temp;
        temp *= nums[i];
    }

    int[] result = new int[nums.length];
    for(int i = 0; i<result.length;i++){
        result[i] = leftProduct[i] * rightProduct[i];
    }
    return result;
   }
}