import java.util.Set;
import java.util.HashSet;

class Solution {
    public static int solution(String dirs) {
    /*
         좌표평면 (0, 0) 위치에서 시작
         좌표평면 크기 왼쪽 위(-5, 5), 왼쪽 아래(-5, -5), 오른쪽 위(5, 5), 오른쪽 아래(5, -5)
         return : 캐릭터가 처음 걸어본 길의 길이

         제약:
         좌표평면 크기 벗어나면 무시
         dirs의 길이는 500 이하의 자연수
         "ULURRDLLU"    ->     7
         */
        
        // 현재 위치
        int x = 0, y = 0;
        
        // 걸어본 길을 저장하는 Set (중복 제거를 위해)
        // 양방향 길을 같은 것으로 처리하기 위해 정규화된 문자열 사용
        Set<String> visitedPaths = new HashSet<>();
        
        // dirs 문자열을 하나씩 처리
        for (char command : dirs.toCharArray()) {
            int nextX = x, nextY = y;
            
            // 다음 위치 계산
            switch(command) {
                case 'U': nextY++; break;  // 위로
                case 'D': nextY--; break;  // 아래로  
                case 'R': nextX++; break;  // 오른쪽으로
                case 'L': nextX--; break;  // 왼쪽으로
                default: continue; // 잘못된 명령어는 무시
            }
            
            // 경계 체크: (-5, -5) ~ (5, 5) 범위를 벗어나면 무시
            if (nextX < -5 || nextX > 5 || nextY < -5 || nextY > 5) {
                continue;
            }
            
            // 길을 문자열로 표현 (양방향을 같은 것으로 처리하기 위해 정규화)
            String path = normalizePath(x, y, nextX, nextY);
            visitedPaths.add(path);
            
            // 현재 위치 업데이트
            x = nextX;
            y = nextY;
        }
        
        return visitedPaths.size();
    }
      // 두 점 사이의 길을 정규화하는 메서드
    // (0,0)→(0,1)과 (0,1)→(0,0)을 같은 길로 처리
    private static String normalizePath(int x1, int y1, int x2, int y2) {
        // 시작점과 끝점을 정렬하여 항상 같은 형태로 만듦
        if (x1 < x2 || (x1 == x2 && y1 < y2)) {
            return x1 + "," + y1 + "->" + x2 + "," + y2;
        } else {
            return x2 + "," + y2 + "->" + x1 + "," + y1;
        }
    }

    public static void main(String[] args) {
        String dirs = "ULURRDLLU";
        int answer = solution(dirs);
        System.out.println(answer); // 예상 출력: 7
        
        // 추가 테스트
        String dirs2 = "LULLLLLLU";
        int answer2 = solution(dirs2);
        System.out.println(answer2); // 예상 출력: 7
    }
}