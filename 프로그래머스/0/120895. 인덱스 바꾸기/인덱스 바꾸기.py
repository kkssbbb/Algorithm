def solution(data, num1, num2):
    dataList = list(data)

    dataList[num1] = data[num2]
    dataList[num2] = data[num1]
    answer = ""


    return answer.join(dataList)