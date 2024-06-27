def solution(n):
    answer = 0
    arr = list(str(n))
    for i in arr:
        num = int(i)
        answer += num
    
    return answer