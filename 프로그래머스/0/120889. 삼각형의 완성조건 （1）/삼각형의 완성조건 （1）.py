def solution(sides):
    answer = 0
    # 같거나 작으면 2
    # 작으면 1
    sides.sort()
    
    if sides[2] < sides[0] + sides[1]:
        return 1
    else:
        return 2