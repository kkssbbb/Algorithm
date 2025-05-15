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
    
    def add_node(self, index, value):
        count =0
        cur = self.head
        add_node = Node(value)

        if(index < 0):
            print("오류: 인덱스는 0이상이여야 합니다.")
            return

        if index == 0 :
            add_node.next = self.head
            self.head = add_node
            return
        
        while cur is not None:
            if count == index:
                   temp_next_node = cur.next
                   cur.next = add_node
                   add_node.next = temp_next_node
            cur = cur.next
            count += 1
        

linked_list = LinkedList(5)
linked_list.append(12)
linked_list.add_node(0-1,3)
linked_list.print_all()