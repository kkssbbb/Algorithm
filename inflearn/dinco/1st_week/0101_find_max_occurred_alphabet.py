alphabet = ['a','b','c','d','e','f','g','h','i','j','k','a','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

def find_max_occurred_alphabet(string):
    result = ''
    list = [s for s in string if s!= ' ']
    map = {}
    for i in alphabet:
        count = 0
        for j in list:
            if i == j:
                count += 1
        map[i] = count

    result = max(map, key=map.get)
    return result


result = find_max_occurred_alphabet
print("정답 = i 현재 풀이 값 =", result("hello my name is dingcodingco"))
print("정답 = e 현재 풀이 값 =", result("we love algorithm"))
print("정답 = b 현재 풀이 값 =", result("best of best youtube"))