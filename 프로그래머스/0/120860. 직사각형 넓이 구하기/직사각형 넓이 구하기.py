def solution(dots):
    answer = 0
    xDotList = [dot[0] for dot in  dots]
    yDotList = [dot[1] for dot in  dots]

    width = max(xDotList) - min(xDotList)
    length = max(yDotList) - min(yDotList)

    area = width * length

    answer = area
    return answer