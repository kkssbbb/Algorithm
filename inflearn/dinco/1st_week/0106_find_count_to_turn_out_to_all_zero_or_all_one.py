input = "011110"


def find_count_to_turn_out_to_all_zero_or_all_one(string):

    # 1. 각각 배열로 만든다.
    # 2. 배열에서 0이많은지 1이많은지 카운트한다
    # 3. 0이 많으면 배열중에 0인값은 1로 바꾼다.
    
    # 1
    list = [int(n) for n in string]
    count_map = {key: 0 for key in range(2)}

    # 2
    for i in list:
        if i == 0:
            count_map[0] += 1
        if i == 1:
            count_map[1] += 1

    #3
    if count_map[0] > count_map[1]:
        for i in range(len(list)):
            if list[i] == 1:
                list[i] = 0
    if count_map[0] < count_map[1]:
        for i in range(len(list)):
            if list[i] == 0:
                list[i] = 1

        

    return list


result = find_count_to_turn_out_to_all_zero_or_all_one(input)
print(result)