class Node:
    def __init__(self, data):
        self.data = data
        self.next = None



first_node = Node(2)
second_node = Node(23)

first_node.next = second_node
