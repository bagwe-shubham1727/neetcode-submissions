class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
      res = []
      prod = 1

      for i in range (len(nums)):
        x = nums.pop(0)
        for i in range (len(nums)):
            prod = prod * nums[i]
        
        res.append(prod)
        prod = 1
        nums.append(x)

      return res