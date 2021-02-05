/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0

*/


class Solution {
    public int reverse(int x) {
        try{
         String num = ""+x;
         String num2 = "";
         
         for(int i = num.length()-1; i >= 0 ;i--){
             if(num.charAt(i) != '-'){
             num2 += num.charAt(i);}
         }
         
         if(x < 0){
             return -Integer.parseInt(num2);
         }else{return Integer.parseInt(num2);}
     }
     catch(Exception e){
         return 0;
     }
 }
}


/*
class Solution {
    public int reverse(int x){
        // push and pop operation
        int rev = 0;
        while(x != 0){
            int pop = x % 10;
            x /= 10;

            // overflow can be caused at 'rev = rev * 10 + pop'
            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE/10) && pop > 7) return 0;
            if(rev < Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE/10) && pop < -8) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

*/