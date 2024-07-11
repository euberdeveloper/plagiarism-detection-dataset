import numpy as np

def sum_major_diagonal(matrix):
    result = 0
    for i in range(4):
        result += matrix[i][i]
    return result

if __name__ == "__main__":
    matrix = np.zeros((4, 4))
    print("Enter a 4-by-4 matrix row to row: ")
    for i in range(4):
        for j in range(4):
            matrix[i][j] = float(input())
    result = sum_major_diagonal(matrix)
    print(f"Sum of the element in the major diagonal is {result}")

