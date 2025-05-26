import java.util.HashMap;
import java.util.HashSet;

class Solution{
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
        //U(0,1) D(0,-1) R(1,0) L(-1,0)
        initLocation();
        int x = 0;
        int y = 0;

        HashSet<String> answer = new HashSet<>();
        for(int i=0; i<dirs.length(); i++){
            int[] offset = location.get(dirs.charAt(i));
             int nx = x + offset[0];
             int ny = y + offset[1];
            
             if(!isValidMove(nx,ny)) continue;

            answer.add(x +"" +y +"" +nx +"" +ny);
            answer.add(nx +"" +ny +"" +x +"" +y);

            x=nx;
            y=ny;
        }

    return answer.size() /2;
    }

    private static boolean isValidMove(int nx, int ny){
        return -5<=nx && nx<6 && -5<=ny && ny < 6; 
    }

    private static final HashMap<Character,int[]> location = new HashMap<>();

    private static void initLocation(){
        location.put('U',new int[]{0,1});
        location.put('D',new int[]{0,-1});
        location.put('R',new int[]{1,0});
        location.put('L',new int[]{-1,0});
    }

    public static void main(String[] args) {
        String dirs = "ULURRDLLU";
        int answer = solution(dirs);
        System.out.println(answer); // 출력: 7
        
        String dirs2 = "LULLLLLLU";
        int answer2 = solution(dirs2);
        System.out.println(answer2); // 출력: 7
    }
}