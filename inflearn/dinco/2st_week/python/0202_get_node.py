class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self, value):
        self.head = Node(value)

    def append(self, value):
        cur = self.head
        while cur.next is not None:
            cur = cur.next
        cur.next = Node(value)

    def print_all(self):
        cur = self.head
        while cur is not None:
            print(cur.data)
            cur = cur.next

    def get_node(self, index):        
        if index < 0:
            print("오류: 인덱스는 0이상이여야 합니다.")

        count = 0
        cur = self.head
        while cur is not None:
            if count == index:
                return cur.data
            cur = cur.next
            count += 1

        print(f"인덱스 {index} 가 범위를 벗어났습니다.")
        return None

linked_list = LinkedList(5)
linked_list.append(12)
finded_data = linked_list.get_node(6)
print(finded_data)