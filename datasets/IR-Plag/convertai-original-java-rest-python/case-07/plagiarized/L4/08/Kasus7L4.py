import numpy as np

# minta input
matrix = np.zeros((4, 4))
print("Enter a 4 by 4 matrix row by row:")

# input the matrix
for i in range(4):
    matrix[i] = [float(x) for x in input().split()]

sum_diagonal = np.trace(matrix)
print(f"Sum of the elements in the major diagonal is {sum_diagonal}")

