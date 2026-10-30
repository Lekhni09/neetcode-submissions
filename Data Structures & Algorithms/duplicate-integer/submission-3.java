class Solution {
    public boolean hasDuplicate(int[] nums) {

        //solution without sorting
        Set<Integer>  set = new HashSet<>();
        for(int num: nums){
           
            if(!set.add(num)){
                return true;
            }
             
        }
        return false;

        
    }
}