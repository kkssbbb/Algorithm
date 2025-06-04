###  toArray()가 int[]와 Integer[]에 대해 다르게 동작하는 이유

스트림에서 주요 스트림 두 가지가 있다.  
1. 기본형 스트림
    - IntStrema: int 같이 기본형을 다루는 기본형 스트림들. 
2. 참조형 스트림
    - Stream<T>: String, Integer 등 객체(침조형)를 다루는 스트림

위 코드 toArray() 가 다르게 동작하는 이유는 기본형 또는 참조형 스트림에 따라서 toArray()가 다르게 동작하기 대문이다.

#### toArray() 동작 차이
```java   
   Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
   /*    
   boxed().distinct() 로 기본형 배열이 Integer[]로 박싱되어 반환되는 타입은 참조형
   스트림의 Stream<T> 이다. 
   Stream<T> 의 toArrau()는 Object[] 를 반환하기때문에  toArray(Integer[]::new) 처럼
   원하는 타입의 생성자를 명시 해주어야 한다.
   */
   int [] answer = Arrays.stream(result).mapToInt(Integer::intValue).toArray();   
   /*
   mapToInt(Integer::intValue)로 기본형스트림인 IntStrem이 반환 되어 IntStream()의
   toArray()는 반환타입이 int[]로 고정 되어 있다.
   */
```

</br>
</br>

--- 

### TreeSet
- TreeSet은 자바 컬렉션 프레임워크의 Set 인터페이스를 구현한 클래스 중 하나로, 중복을 허용하지 않으며 자동으로 정렬되는 집합 자료구조
- 데이터가 추가될 때마다 자동으로 정렬되며, 기본적으로 오름차순(자연 순서) 정렬이 적용

#### TreeSet의 주요 특징

- 중복 불가: 같은 값을 두 번 넣을 수 없다.

- 자동 정렬: 데이터를 넣는 즉시 오름차순으로 정렬.

- 빠른 검색/삽입/삭제: 내부적으로 트리 구조를 사용해 대부분의 연산이 O(log n) 시간에 처리된다.

- 순서 보장: HashSet과 달리 항상 정렬된 상태로 요소가 저장된다.


```java
   public static int[] solution2(int[] arr){
        //반복문 사용
        //중복값제거 
        //자동 내림차순 정렬
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        // TreeSet<Integer> set = new TreeSet<>(); -> 자동 오름차순 정렬

        for(int num : arr){
            set.add(num);
        }


        int[] result = new int[set.size()];

        //set.pollFirst() set에서 첫 번째 값 꺼내고, set에서 제거
        for(int i=0; i<result.length; i++){
            result[i] = set.pollFirst();
        }


        return result;
    }
    
```


```java
    public static int[] solution1(int[] arr){
        //스트림 사용
        //중복제거 distinct() 는 내부적으로 Set을 이용하여 중복제거를 하기때문에 시간복잡도는 O(N) 이다
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        //내림차순 정렬 대부분의 정렬알고리즘(퀵정렬,병합정렬)은 O(NlogN) 이다
        Arrays.sort(result, Collections.reverseOrder());
        //기본 배열로 번환하여 리턴
        int [] answer = Arrays.stream(result).mapToInt(Integer::intValue).toArray();
        return answer;
    }

```
시간복잡도 : O(NlogN)

Java의 Arrays.sort() (객체 배열, 예: Integer[])
→ TimSort라는 정렬 알고리즘을 사용
TimSort는 합병정렬(Merge Sort)와 삽입정렬(Insertion Sort)의 장점을 합친 알고리즘이다.
시간복잡도는 O(NlogN) (최악/평균/최선 모두)

- Collections.reverseOrder()는 "내림차순으로 정렬하라"는 기준만 제공
- 실제 정렬은 Arrays.sort()에서 TimSort로 수행 → O(NlogN)
- Collections.reverseOrder()는 정렬 기준만 바꿔주고, 실제 정렬은 TimSort(합병정렬 기반)로 O(NlogN)에 동작합니다.