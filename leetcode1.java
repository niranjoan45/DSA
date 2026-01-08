// Remove Duplicates 
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

// Add Digits
class Solution {
    public int addDigits(int num) {
        while (num >= 10){
         int sum = 0;
          while(num > 0){
            sum = sum + (num%10);
            num = num/10;
          }  
          num = sum;
        }
        return num;
    }
}

//Palindrome Number
class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        while(x>0){
            int digit = x%10;
            reverse = reverse*10+digit;
            x = x/10;
        }
        return original==reverse;
    }
}

//Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
      for(int i=1;i<nums.length;i++){
        nums[i] = nums[i] + nums[i-1];
      }
      return nums;
    }
}

//Subtract the Product and Sum of Digits of an Integer
class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while(n>0){
            int digit = n%10;
            product = product * digit;
            sum = sum + digit;
            n = n/10;
        }
        return product - sum;
    }
}

//Fizz Buzz
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(); 
        for(int i=1;i<=n;i++){
        if(i%3==0 && i%5==0){
          answer.add("FizzBuzz");
        }

        else if(i%3==0){
            answer.add("Fizz");
        }
        else if(i%5==0){
            answer.add("Buzz");
        }
        else {
            answer.add(String.valueOf(i));
        }
        }
        return answer;
        
    }
}

//subarray equal to k
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
