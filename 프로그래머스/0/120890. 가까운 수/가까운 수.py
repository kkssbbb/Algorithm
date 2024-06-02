def solution(array, n):
    array.sort()
    temp = []
    
    for i in array:
        temp.append(abs(i-n))
        
        
    
    return array[temp.index(min(temp))]