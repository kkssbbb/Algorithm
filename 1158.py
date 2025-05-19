class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self,data):
        self.head = data


# n= 사람 수  k=제거순번

a, b = map(int, input().split())
print(a)

# 1부터 n번까지 링크리스트에담음

# k번재 사람 제거함
# 제거한 순서대로 리스트에 저장함