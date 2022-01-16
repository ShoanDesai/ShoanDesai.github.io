def isPalindrome(x):
    """
    :type x: int
    :rtype: bool
    """
    number = str(x)
    number_length = len(number)
    return checkIfPalindrom(number, number_length)

def checkIfPalindrom(number, number_length):
    
    if (number_length is 1):
        return True
    
    if (number_length is 2):
        if (number[0] is not number[1]):
            return False
        else:
            return True
    
    if (number[0] is not number[-1]):
        return False
    else:
        return checkIfPalindrom(number[1:-1], number_length - 2)
    
