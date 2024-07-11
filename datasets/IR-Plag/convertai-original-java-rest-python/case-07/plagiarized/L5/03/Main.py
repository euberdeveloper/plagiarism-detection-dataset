import numpy as np

print("Enter a 4 by 4 matrix row by row: ")
n = np.zeros((4, 4))

for i in range(4):
    for j in range(4):
        n[i][j] = float(input())

sum_diagonal = np.trace(n)

print(f"Sum of the elements in the major diagonal is {sum_diagonal}")

