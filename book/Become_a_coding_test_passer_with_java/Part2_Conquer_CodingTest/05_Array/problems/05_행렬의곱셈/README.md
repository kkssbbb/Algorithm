행렬 곱셈 방법
1. 곱셈이 가능한 조건
**A(행렬) × B(행렬)**에서
A의 열 개수 = B의 행 개수여야 곱셈이 정의

###  예시

A (2×3 행렬):

$$
A = \begin{bmatrix}
1 & 2 & 3 \\
4 & 5 & 6
\end{bmatrix}
$$

B (3×2 행렬):

$$
B = \begin{bmatrix}
7 & 8 \\
9 & 10 \\
11 & 12
\end{bmatrix}
$$

곱셈 결과 C (2×2 행렬):

$$
C = A \times B = \begin{bmatrix}
1 \times 7 + 2 \times 9 + 3 \times 11 & 1 \times 8 + 2 \times 10 + 3 \times 12 \\
4 \times 7 + 5 \times 9 + 6 \times 11 & 4 \times 8 + 5 \times 10 + 6 \times 12
\end{bmatrix}
$$

즉,

$$
C_{11} = 1 \times 7 + 2 \times 9 + 3 \times 11 = 7 + 18 + 33 = 58 \\
C_{12} = 1 \times 8 + 2 \times 10 + 3 \times 12 = 8 + 20 + 36 = 64 \\
C_{21} = 4 \times 7 + 5 \times 9 + 6 \times 11 = 28 + 45 + 66 = 139 \\
C_{22} = 4 \times 8 + 5 \times 10 + 6 \times 12 = 32 + 50 + 72 = 154
$$

따라서,

$$
C = \begin{bmatrix}
58 & 64 \\
139 & 154
\end{bmatrix}
$$

