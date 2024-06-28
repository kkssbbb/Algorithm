def solution(array):
    answer = 0
    findNum = '7'

    for i in array:
        num = list(str(i))
        for j in num:
            if findNum == j:
                answer +=1
    return answer