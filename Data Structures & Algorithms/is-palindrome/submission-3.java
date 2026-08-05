class Solution {
    public boolean isPalindrome(String s) {

       s = s.toLowerCase();
       s = s.replaceAll("[^a-z0-9]","");

       StringBuilder original = new StringBuilder(s);
       StringBuilder reversed = new StringBuilder(s).reverse();

       return original.toString().equals(reversed.toString());
 
        
    }
}
