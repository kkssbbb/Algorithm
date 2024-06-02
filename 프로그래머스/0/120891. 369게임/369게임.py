def solution(input):
    check = ['3','6','9']
    answer = 0
    arr = list(str(input))
    for i in range(len(arr)):
        for j in range(len(check)):
            if arr[i] == check[j]:
                answer += 1
    return answer  
