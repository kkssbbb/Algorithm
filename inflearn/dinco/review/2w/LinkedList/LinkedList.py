class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self , value):
        self.head = Node(value)

    def append(self, data):
        current = self.head
        while current.next is not None:
            current = current.next
        current.next = Node(data)

    def __iter__(self):  # 반복자 메서드 추가
        current = self.head
        while current is not None:
            yield current.data  # 현재 노드의 데이터를 반환
            current = current.next      


linked_list = LinkedList(5)
linked_list.append(12)
linked_list.append(15)

for i in linked_list:
    print(i)