### Deque 주요 메서드
| 메서드                        | 동작 방향 | 설명                                         |
|-------------------------------|-----------|----------------------------------------------|
| addFirst(e)                   | 앞        | 앞에 요소 추가 (실패 시 예외)                |
| addLast(e), add(e)            | 뒤        | 뒤에 요소 추가 (실패 시 예외)                |
| offerFirst(e)                 | 앞        | 앞에 요소 추가 (성공 여부 boolean 반환)      |
| offerLast(e), offer(e)        | 뒤        | 뒤에 요소 추가 (성공 여부 boolean 반환)      |
| removeFirst(), remove()       | 앞        | 앞 요소 제거 및 반환 (비어있으면 예외)       |
| removeLast()                  | 뒤        | 뒤 요소 제거 및 반환 (비어있으면 예외)       |
| pollFirst(), poll()           | 앞        | 앞 요소 제거 및 반환 (비어있으면 null 반환)  |
| pollLast()                    | 뒤        | 뒤 요소 제거 및 반환 (비어있으면 null 반환)  |
| getFirst(), element()         | 앞        | 앞 요소 조회 (비어있으면 예외)               |
| getLast()                     | 뒤        | 뒤 요소 조회 (비어있으면 예외)               |
| peekFirst(), peek()           | 앞        | 앞 요소 조회 (비어있으면 null 반환)          |
| peekLast()                    | 뒤        | 뒤 요소 조회 (비어있으면 null 반환)          |
| push(e)                       | 앞        | 앞에 요소 추가 (Stack push와 동일)           |
| pop()                         | 앞        | 앞 요소 제거 및 반환 (Stack pop과 동일)      |