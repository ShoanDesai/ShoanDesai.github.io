import java.lang.Math;

class Solution {
    
    public int reverse(int x) {
        
        String answer = "";
        int modulus = 10;
        
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x *= -1;
        }
        
        while (x != 0) {
            
            int remainder = x % modulus;
            answer += Integer.toString(remainder/(modulus/10));
            x -= remainder; 
            x = x/10;
   
        }
        
        int intAnswer = 0;
        if (!answer.equals("")) { 
            try {
                // Convert String to int 
                intAnswer = Integer.parseInt(answer); 
            } catch (NumberFormatException e) {
                // If overflow
                return 0;
            }
            
        }
        
        // If negative, add back negative sign
        if (negative) intAnswer *= -1;        

        return intAnswer;
    }
}
