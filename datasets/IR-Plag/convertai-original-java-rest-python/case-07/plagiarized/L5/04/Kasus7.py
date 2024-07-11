import numpy as np

def sum_major_diagonal(matrix):
    n = len(matrix)
    sum_diagonal = 0
    for i in range(n):
        sum_diagonal += matrix[i][i]
    print(f"Sum of the elements in the major diagonal is {sum_diagonal}")

def main():
    n = 4
    print("Enter a 4 by 4 matrix row by row:")
    matrix = np.zeros((n, n))
    for i in range(n):
        for j in range(n):
            matrix[i][j] = float(input())
    sum_major_diagonal(matrix)

if __name__ == "__main__":
    main()

