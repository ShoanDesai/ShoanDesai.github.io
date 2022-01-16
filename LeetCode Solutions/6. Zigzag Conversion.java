class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1) return s;
        
        char[][] zigzagBoard = new char[numRows][s.length()];
        boolean downTraversalMode = true;
        int columnPosition = 0;
        int rowPosition = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            try {
            
                if (downTraversalMode) {
                    zigzagBoard[rowPosition][columnPosition] = s.charAt(i);   
                    rowPosition++;
                //    System.out.println("D " + s.charAt(i));
                } 

                else {
                    zigzagBoard[rowPosition][columnPosition] = s.charAt(i);    
                    rowPosition--;
                    columnPosition++;
                   // System.out.println("UD " + s.charAt(i));
                }
                
            } catch (Exception e) {
                
                i--;
                
                if (downTraversalMode) {
                 //   System.out.println("SWITCH1");
                    downTraversalMode = false;
                    columnPosition++;
                    rowPosition -= 2;
                }
                else {
                 //   System.out.println("SWITCH2");
                    downTraversalMode = true;
                    columnPosition--;
                    rowPosition += 2;

                } 
            }
            
        }
        
        String answerString = "";
        
        for (int j = 0; j < numRows; j++) {
            for (int k = 0; k < s.length(); k++) {
                // \u0000 is the default char value - If value not assigned to the board
                if (zigzagBoard[j][k] != '\u0000') {
                    
                    answerString += Character.toString(zigzagBoard[j][k]);
                    //System.out.println(answerString);
                }
            }
        }
        
        return answerString;
    }
}
