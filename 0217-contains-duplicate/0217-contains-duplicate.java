import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for(int x : nums)
        {
            if (arr.contains(x))
            {
                return true;
            }
            arr.add(x);
        }

        return false;

          
        
    }
    
}