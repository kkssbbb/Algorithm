def solution(str1, str2):
    find_first = str2[0]
    str1_len = len(str1)
    str2_len = len(str2)
    for i in range(str1_len - str2_len + 1):
        if str1[i] == find_first:
            match = True
            for j in range(str2_len):
                if str1[i + j] != str2[j]:
                    match = False
                    break
            if match:
                return 1
    return 2
