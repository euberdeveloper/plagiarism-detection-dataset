import numpy as np

def input_matrix(n):
    matrix = np.zeros((n, n))
    for i in range(n):
        for j in range(n):
            matrix[i, j] = float(input())
    return matrix

def sum_major_diagonal(matrix, n):
    if n >= 0:
        return matrix[n, n] + sum_major_diagonal(matrix, n - 1)
    else:
        return 0

if __name__ == "__main__":
    n = 4
    print("Enter a 4 by 4 matrix row by row:")
    matrix = input_matrix(n)
    print("Sum of the elements in the major diagonal is", sum_major_diagonal(matrix, n - 1))

