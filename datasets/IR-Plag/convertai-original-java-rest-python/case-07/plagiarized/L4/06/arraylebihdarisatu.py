import numpy as np

print("Enter a 4 by 4 matrix row by row: ")
matrix = np.zeros((4, 4))

for x in range(4):
    for y in range(4):
        matrix[x][y] = float(input())

hasil = np.trace(matrix)

print(f"Sum of the elements in the major diagonal is {hasil}")

