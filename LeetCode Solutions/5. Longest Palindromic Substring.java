class Solution {
    public String longestPalindrome(String s) {
        
        
        int distanceBetweenLetters = 0;
        int strSize = s.length();
        int maxLength = 0;
        boolean[][] palinExisits = new boolean[strSize][strSize];
        int answerStartPosition = 0;
        int answerEndPosition = 0;
        
        while (distanceBetweenLetters != strSize) {
            for (int i = 0; i + distanceBetweenLetters < strSize; i++) {
                
                int j = i + distanceBetweenLetters;
                
                if (i == j) palinExisits[i][j] = true;
                
                else if ((j - i) == 1) {
                    if (s.charAt(i) == s.charAt(j)) palinExisits[i][j] = true;
                } 
                
                else {
                    if (s.charAt(i) == s.charAt(j) && palinExisits[i+1][j-1]) {
                        palinExisits[i][j] = true;
                    }
                } 
                
                if ((j - i + 1) > maxLength && palinExisits[i][j]) {
                    answerStartPosition = i;
                    answerEndPosition = j;
                    maxLength = j - i + 1;
                }
                  
            }
            
            distanceBetweenLetters++;
        }
        
        return s.substring(answerStartPosition, answerEndPosition + 1);
        
        
    }
}
