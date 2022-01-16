def isPalindrome(x):
    """
    :type x: int
    :rtype: bool
    """
    
    # Convert to string for easy manipulation. Keep track of string length as well
    number = str(x)
    number_length = len(number)
    
    # Recursive function to determine if palindrome or not
    return checkIfPalindrom(number, number_length)

def checkIfPalindrom(number, number_length):
    
    # Odd base case
    if (number_length is 1):
        return True
    
    # Even base case
    if (number_length is 2):
        if (number[0] is not number[1]):
            return False
        else:
            return True
    
    # Check if fails and if not continue recursive call
    if (number[0] is not number[-1]):
        return False
    else:
        return checkIfPalindrom(number[1:-1], number_length - 2)
    
