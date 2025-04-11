input = 20


def find_prime_list_under_number(number):
    #0과 1은 정수 아님 
    list = []
    for i in range(2, number + 1):
        is_prime = True
        for j in range(2, i):
            if(i % j == 0):
                is_prime=False
        if(is_prime):
            list.append(i)
    return list


result = find_prime_list_under_number(input)
print(result)