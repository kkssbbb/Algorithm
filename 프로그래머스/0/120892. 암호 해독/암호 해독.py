def solution(cipher, code):
    answer = ''
    for i,c in enumerate(cipher,1):
        if i % code == 0:
            answer += c
    return answer