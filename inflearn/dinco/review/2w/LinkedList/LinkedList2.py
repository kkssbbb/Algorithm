class Node:
    
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:

    def __init__(self, data):
        self.head = Node(data)
    
    # append
    def append(self, data):
        current = self.head
        while current.next is not None:
            current = current.next
        current.next = Node(data)

    # printAll
    def printAll(self):
        node = self.head
        while node is not None:
            print(node.data)
            node = node.next
    # 찾기
    def get_node(self, index):
        node = self.head
        count = 0
        while node is not None:
            if count == index:
                print(node.data)
                return
            node = node.next
            count += 1
    # 추가
    
    # 삭제


ll = LinkedList(4)
ll.append(3)
ll.append(2)
ll.get_node(0)