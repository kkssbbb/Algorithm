def solution(s):
    answer = ""
    
    arr = list(s)
    temp_arr = list(s)
           
    for i in arr:
        count = 0
        for j in temp_arr:
            if i == j:
                count +=1
        if count == 1:
            answer +=i
            
    
    a = sorted(answer)
    answer = ''.join(a)
    

    
    
    return answer