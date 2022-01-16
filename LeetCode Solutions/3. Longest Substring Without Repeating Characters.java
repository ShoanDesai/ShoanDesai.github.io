class Solution {
    
    
    /* This solution uses a moving window using a greedy search.
       We search for the longest substring and keep track of the first character 
       of the substring 'startingPosition'. If a character is repeated, we then change
       the starting position and continue our search. Keep track of the length of the search
    */
    
    public int lengthOfLongestSubstring(String s) {
        
        int [] positionTracker = new int[256];
    
        int startingPosition = 1;
        int positionToAssignNext = 1;
        
        int length = 0;
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (positionTracker[s.charAt(i)] < startingPosition) {
                positionTracker[s.charAt(i)] = positionToAssignNext;
                length++;
                if (length > maxLength) maxLength = length;
                
            } else {
                int newStartingPosition = positionTracker[s.charAt(i)] + 1;
                length -= newStartingPosition - startingPosition - 1;
                startingPosition = newStartingPosition;
                positionTracker[s.charAt(i)] = positionToAssignNext;
                
            }
            
            positionToAssignNext++;
        }
           
        return maxLength;
    }
}
