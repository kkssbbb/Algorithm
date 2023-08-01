import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;


    static void solution() {


        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int m = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            graph = new ArrayList[m + 1];
            visited = new boolean[m + 1];

            //그래프 배열 값 배열로 초기화
            for (int i = 1; i <= m; i++) {
                graph[i] = new ArrayList<>();
            }

            //인접리스트로 그래프 관계 설정
            for (int i = 0; i < n; i++) {

                String[] st = br.readLine().split(" ");
                int a = Integer.parseInt(st[0]);
                int b = Integer.parseInt(st[1]);

                graph[a].add(b);
                graph[b].add(a);

            }

            dfs(1);

            int count = 0;
            for (boolean b : visited) {

                if (b) {
                    count++;
                }
            }
            System.out.println(count-1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    static void dfs(int node ) {
       // System.out.println(node);
        visited[node] = true;

        for (int nextNode : graph[node]
        ) {
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }

    }

    public static void main(String[] args) {

        solution();

    }
}