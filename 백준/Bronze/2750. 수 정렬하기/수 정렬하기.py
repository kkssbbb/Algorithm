n = int(input())
numbers = []

for _ in range(n):
    num = int(input())
    numbers.append(num)

arrNumbers = sorted(numbers)

for i in arrNumbers:
    print(i)
