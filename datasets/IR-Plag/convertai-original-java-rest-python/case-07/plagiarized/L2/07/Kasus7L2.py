import numpy as np

def jumlahDiagonalKanan(matrix):
    sum = 0
    for i in range(len(matrix)):
        sum += matrix[i][i]
    return sum

# Get input
print("Enter a 4 by 4 matrix row by row:")
matrix = np.zeros((4, 4))
for i in range(4):
    for j in range(4):
        matrix[i][j] = float(input())

print(f"Sum of the elements in the major diagonal is {jumlahDiagonalKanan(matrix)}")

