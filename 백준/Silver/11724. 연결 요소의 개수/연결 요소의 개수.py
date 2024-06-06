import sys
sys.setrecursionlimit(10**7)

# 입력 받기
input = sys.stdin.readline
n, m = map(int, input().strip().split())

# 그래프 초기화
graph = {i: [] for i in range(1, n + 1)}
for _ in range(m):
    u, v = map(int, input().strip().split())
    graph[u].append(v)
    graph[v].append(u)

# DFS 함수 정의
def dfs(node):
    visited[node] = True
    for i in graph[node]:
        if not visited[i]:
            dfs(i)

# 요소 방문 체크 딕셔너리
visited = {i: False for i in range(1, n + 1)}

count = 0
# 모든 노드를 탐색하여 연결 요소를 찾음
for i in range(1, n + 1):
    if not visited[i]:
        dfs(i)
        count += 1

print(count)
