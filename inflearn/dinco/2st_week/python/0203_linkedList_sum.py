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


def get_linked_list_sum(linked_list_1, linked_list_2):
    node1 = linked_list_1.head
    node2 = linked_list_2.head

    str_num1 = ""
    while node1 is not None:
        str_num1 += str(node1.data) 
        node1 = node1.next

    str_num2 = ""
    while node2 is not None:
        str_num2 += str(node2.data) 
        node2 = node2.next
    
    num1 = int(str_num1)
    num2 = int(str_num2)
    answer = num1+ num2
    return print(answer)


linked_list_1 = LinkedList(6)
linked_list_1.append(7)
linked_list_1.append(8)

linked_list_2 = LinkedList(3)
linked_list_2.append(5)
linked_list_2.append(4)

print(get_linked_list_sum(linked_list_1, linked_list_2))