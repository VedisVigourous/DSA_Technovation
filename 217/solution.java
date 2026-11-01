import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int elem: nums){
            if(!set.add(elem)){
                return true;
            }
        }
        return false;
    }
}