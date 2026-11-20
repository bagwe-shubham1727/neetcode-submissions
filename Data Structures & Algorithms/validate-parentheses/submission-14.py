class Solution:
    
    def isValid(self, s: str) -> bool:
        balance = True
        stack = []
        for i in s:
            if  i == '(' or i == '{' or i == '[':
                balance = False
                stack.append(i)
            elif i == ')' or i == '}' or i == ']':
                balance = False
                if len(stack) != 0:
                    char = stack.pop()
                    balance = (char == '(' and i == ')') or (char == '[' and i == ']') or (char == '{' and i == '}')
                if not balance:
                    return False
                    break
        if len(stack) != 0:
            balance = False
        return balance       
             
        