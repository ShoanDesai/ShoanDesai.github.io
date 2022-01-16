class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dictionaryOfNumbers = {}
                
        index = 0
        for number in nums: 
            
            searchNumber = target - number
            
            try:
                dictionaryOfNumbers[searchNumber]
                return [dictionaryOfNumbers[searchNumber], index]                
                
            except KeyError:
                dictionaryOfNumbers[number] = index
                index += 1
                continue
            
