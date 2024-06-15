def solution(num, k):
    answer = 0
    
    arr = list(str(num))
    k = str(k)
    
    if k in arr:
        answer = arr.index(k) +1
    else:
        answer = -1
    return answer