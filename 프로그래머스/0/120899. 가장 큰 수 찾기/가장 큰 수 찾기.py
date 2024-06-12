def solution(array):
    answer = []
    n = max(array)
    answer.append(n)
    answer.append( array.index(n))
    
    return answer