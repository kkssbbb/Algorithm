def solution(s,s2):
    count = 0
    for i in s:
        for j in s2:
             if i == j:
                     count += 1
    return count