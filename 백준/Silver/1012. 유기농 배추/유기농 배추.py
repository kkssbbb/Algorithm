import sys
sys.setrecursionlimit(10**7)
#상하좌우 인접노드 방문
#배추모여있는곳 지렁이 1마리 
# 0 = 배추 x  /  1 = 배추 O


#t = 테스트케이스 개수
t = int(input())



#dfs
def dfs(x,y,graph,n,m) :
  # 범위 초과 예외처리
  if x<0 or y<0 or x >=m or y>=n:
    return False

  if graph[y][x] == 1:
    #중복방지 방문노드 체크
    graph[y][x] = 0
    
    #상하좌우 인접노드 방문
    dfs(x-1 , y ,graph,n,m)
    dfs(x+1 , y ,graph,n,m)
    dfs(x , y-1 ,graph,n,m)
    dfs(x , y+1 ,graph,n,m)
    
    return True
  
  return False

  


result=[]
for _ in range(t):
  
  # m,n,k = 가로,세로,배추개수
  m,n,k = map(int,input().split())
  
  # 그래프 m*n 0으로 초기화 
  graph = []
  for i in range(n):
    row = [0] * m
    graph.append(row)
  # 배추위치 1로 추기화
  xy = []
  for i in range(k):
    xy.append(list(map(int, input().split())))
  for arr in xy:
    x = int(arr[1])
    y = int(arr[0])

    graph[x][y] = 1

  count = 0
  #모든 노드 탐색
  for i in range(n):
    for j in range(m):

      if graph[i][j] == 1:
        count += 1
        dfs(j,i,graph,n,m)  
  result.append(count)
  
#결과 출력
for i in result:
  print(i)