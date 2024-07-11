import numpy as np

matrix = []
print("Enter a 4 by 4 matrix row by row: ", end="")
for _ in range(4):
    row = [float(x) for x in input().split()]
    matrix.append(row)

matrix = np.array(matrix)
diagonal_sum = np.trace(matrix)

print(f"Sum of the elements in the major diagonal is {diagonal_sum}")

