input = 20


def find_prime_list_under_number(number):
    # 1 , 자신
    list = [2,3]

    for n in range(2, number + 1):
        for i in list:
            if n % i == 0:
                break
        else:
            list.append(n)

    return list


 # [2, 3, 5, 7, 11, 13, 17, 19]

result = find_prime_list_under_number(input)
print(result)