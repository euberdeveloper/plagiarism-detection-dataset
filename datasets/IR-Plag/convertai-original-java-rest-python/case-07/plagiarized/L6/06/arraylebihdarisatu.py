import numpy as np

def HitungDiagonal():
    matrix = np.zeros((4, 4))
    print("Enter a 4 by 4 matrix row by row:")
    for x in range(4):
        matrix[x] = [float(num) for num in input().split()]
    
    diagonal_sum = np.trace(matrix)
    return diagonal_sum

print(f"Sum of the elements in the major diagonal is {HitungDiagonal()}")

