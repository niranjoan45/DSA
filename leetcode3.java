//kids with greater candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<candies.length;i++){
            if (candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}

//Shuffle String

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        for(int i=0; i<indices.length;i++){
            int pos = indices[i];
            chars[pos] = s.charAt(i);
        }
        String result = "";
        for(int i=0; i<chars.length;i++){
            result+=chars[i];
        }
    return result;
    }
}

//Range Sum Query 

class NumArray {
          int[] prefix ;
    public NumArray(int[] nums) {
        int n= nums.length;
        prefix = new int[n];
        prefix[0] = nums[0];
        for(int i=1; i<n;i++){
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