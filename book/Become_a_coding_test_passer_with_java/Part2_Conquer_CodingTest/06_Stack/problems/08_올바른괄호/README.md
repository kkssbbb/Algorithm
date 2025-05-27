문제 : [올바른 괄호](https://school.programmers.co.kr/learn/courses/30/lessons/12909?gad_source=1&gad_campaignid=22499034228&gbraid=0AAAAAC_c4nB7Ef1xJG_naK7X6BXiRnX3F&gclid=Cj0KCQjwotDBBhCQARIsAG5pinMC4BsuH3pJKi7KAM8-Eqe9aYHTBkdXqNCUCemtZVgDoyoXCYA3PG4aAkOwEALw_wcB)

keyword
```
#deque(Double Ended Queue)
```
---

1. Deque란?

- Double Ended Queue의 약자, 덱 또는 데크라고 읽음.
- Stack(후입선출, LIFO)과 Queue(선입선출, FIFO)를 모두 구현할 수 있는 자료구조.
- 양쪽(앞/뒤)에서 삽입과 삭제가 가능

2. 선언
```java
Deque<Integer> deque = new ArrayDeque<>();
Deque<String> deque2 = new LinkedList<>();
```
- ArrayDeque는 메모리 효율과 속도가 좋아 일반적으로 추천.

- LinkedList는 중간 삽입/삭제가 잦거나 List 기능도 필요할 때 사용.


> "가장 최근", "가장 가까운", "뒤에서부터" 같은 키워드를 보면 스택 사용을 고려해보는 것이 좋다.
"가장 최근/가까운"이라는 키워드가 나오면 스택을 떠올려야 하는 이유
1. 시간적 순서가 중요한 문제에서 스택이 자주 사용됨
2. 역순 처리가 필요한 상황에 적합
3. LIFO 특성이 "가장 최근 것부터 처리"라는 요구사항과 자연스럽게 매칭됨



## 오답 노트
점수 92.3 / 100.0 , 대부분의 테스트 케이스는 통과하지만 런타임에러로 통과 못하는 테스트케이스가 존재
```java
import java.util.Deque;
import java.util.ArrayDeque;
class Solution{
    static boolean  solution(String s) {
        boolean answer = false;
        //스택 값 초기화
        Deque<Character> deq = new ArrayDeque<>();
        
        if(s.charAt(0) == ')') return false;
        if(s.charAt(s.length() -1) == '(') return false;
        
        //스택에 열린괄호 넣다가 닫힌가로 낳오면 최근의 열린괄호를 pop 한다.
        //그리고 스택에 요소가 있으면 false , 없으면 true 반환.
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                deq.push(s.charAt(i)); //(
            }else if(s.charAt(i) == ')'){
                deq.pop();
            }
        }
        if(deq.peekLast() == null) return true;

        return answer;
    }
}
```
주요 문제
1. 빈스택에서 pop() 호출시 에러  
- 예외 케이스 : String s = "())";  // 첫 문자는 '('이므로 첫 번째 체크를 통과
    1. '(' → 스택에 push (스택: ['('])
    2. ')' → 스택에서 pop (스택: [] 비어짐)
    3. ')' → 스택이 비어있는데 pop() 호출 → NoSuchElementException 발생

2. peekLast() 사용의 부적절함  
Deque를 사용했지만 논리적으로 Stack 을 이용해서 문제를 풀려고했는데 이는 스택의 LIFO 를 무시됨.
    - peekLast()는 덱의 맨 뒤 요소를 확인하는 메서드
    - 하지만 스택은 LIFO 구조로 맨 앞(head)에서 push/pop이 일어남
    - isEmpty()로 명확학 의도를 전달하는게 좋다.