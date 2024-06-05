n = int(input())

graph = []

for i in range(n):
  graph.append(list(map(int, input())))


#dfs
def bfs(x, y):

  #범위 조건
  if x < 0 or y < 0 or x >= n or y >= n:
    return False

  if graph[x][y] == 0:
    return 0

  #중복 방지
  graph[x][y] = 0

  #상하좌우 인접노드 탐색
  # 카운트 초기화
  count = 1
  count += bfs(x - 1, y)
  count += bfs(x + 1, y)
  count += bfs(x, y - 1)
  count += bfs(x, y + 1)
  return count


total_count = 0
house_count = []

#g모두 탐색
for i in range(n):
  for j in range(n):
    if graph[i][j] == 1:
      total_count += 1
      house_count.append(bfs(i, j))

# 출력
print(total_count)
house_count.sort()
for i in house_count:
  print(i)
