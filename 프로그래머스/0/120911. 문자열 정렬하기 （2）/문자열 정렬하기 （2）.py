def solution(my_string):
    answer = my_string.lower()

    char_list = list(answer)

    char_list.sort()
    answer = ''.join(char_list)
    return answer

