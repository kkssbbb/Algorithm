class Node:
    def __self__(self, value):
        self.value = value
        self.next = None


class LinkedList:
    def __self__(self, value):
        self.head = Node(value)
    
    def append(self, value):
        cur =  self.head
        while cur.next is not None:
            cur = cur.next
        cur.next = Node(value)

    def print_all(self):
        cur = self.head
        while cur is not None:
            print(cur.value)
            cur = cur.next

list = LinkedList(5)
list.append(11)
list.print_all()