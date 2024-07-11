import numpy as np

def sum_major_diagonal(matrix):
    return np.trace(matrix)

if __name__ == "__main__":
    matrix = np.zeros((4, 4))
    print("Enter a 4-by-4 matrix row by row")
    for i in range(4):
        for j in range(4):
            matrix[i, j] = float(input())
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(matrix)}")

