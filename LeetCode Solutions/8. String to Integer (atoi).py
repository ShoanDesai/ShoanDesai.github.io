class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """

        negative = False
        positive = False
        
        # Empty string check
        if (s == '') :
            return 0  
        
        # First remove leading whitspaces
        while (s[0] == ' ') :
              s = s[1:]
              if (s == '') :
                  return 0
     

        # Check if the first characted is a postive or negative sign. If unexpected characted, return 0
        if (s[0] == '-') :
            negative = True
            s = s[1:]
        elif (s[0] == '+') :
            postive = True
            s = s[1:]
        elif (s[0] == '0' or  s[0] == '1' or s[0] == '2' or s[0] == '3' or s[0] == '4' or s[0] == '5' or s[0] == '6' or s[0] == '7' or s[0] == '8' or s[0] == '9') :
            postive = True
        else :
            return 0

        # Read string until character
        index = 0
        while (True) :

            # Check if out of bounds
            try:
                s[index]
            except IndexError:
                s = s[:index]
                break

            if (s[index] == '0' or  s[index] == '1' or s[index] == '2' or s[index] == '3' or s[index] == '4' or s[index] == '5' or s[index] == '6' or s[index] == '7' or s[index] == '8' or s[index] == '9') :       
                index += 1
                continue

            else: 
                s = s[:index]
                break
    
        # Another empty string check
        if (s == '') :
            return 0  
        
        # Convert return number to int
        returnNumber = int(s)

        # Adjust for sign and clamping
        if negative:
            returnNumber = returnNumber * -1
            if (returnNumber < -2147483648):
                return -2147483648
            else:
                return returnNumber
        else:
            if (returnNumber > 2147483647):
                return 2147483647
            else:
                return returnNumber
