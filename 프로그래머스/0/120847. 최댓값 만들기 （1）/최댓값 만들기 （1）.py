def solution(numbers):
    firstMaxNum = secondMaxNum = 0
    
    for i in numbers:
        if i > firstMaxNum:
            secondMaxNum = firstMaxNum
            firstMaxNum = i
        elif i > secondMaxNum:
            secondMaxNum = i
    
    return firstMaxNum * secondMaxNum