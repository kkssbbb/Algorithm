def solution(numbers):
    # 숫자 스펠링 리스트
    numList = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    
    # 결과 문자열을 저장할 변수
    result = numbers
    
    # numList의 각 요소를 순회하며 변환
    for i, word in enumerate(numList):
        result = result.replace(word, str(i))
    
    # 문자열을 숫자로 변환
    answer = int(result)
    
    return answer

