import sys
sys.setrecursionlimit(10**6)

def dfs(graph, y, x):
  if x < 0 or y < 0 or x >= len(graph[0]) or y >= len(graph):
      return False
  if graph[y][x] == 0:
      return False

  graph[y][x] = 0

  # 상하좌우
  dfs(graph, y - 1, x)
  dfs(graph, y + 1, x)
  dfs(graph, y, x - 1)
  dfs(graph, y, x + 1)

  # 대각선(위 왼,위 오, 아래 왼, 아래 오)
  dfs(graph, y - 1, x - 1)
  dfs(graph, y + 1, x - 1)
  dfs(graph, y - 1, x + 1)
  dfs(graph, y + 1, x + 1)

  return True

def count_islands(w, h, graph):
  count = 0
  for i in range(h):
      for j in range(w):
          if graph[i][j] == 1:
              if dfs(graph, i, j):
                  count += 1
  return count

def input_data():
  while True:
      w, h = map(int, input().split())
      if w == 0 and h == 0:
          break
      graph = [list(map(int, input().split())) for _ in range(h)]
      island_count = count_islands(w, h, graph)
      print(island_count)

input_data()
