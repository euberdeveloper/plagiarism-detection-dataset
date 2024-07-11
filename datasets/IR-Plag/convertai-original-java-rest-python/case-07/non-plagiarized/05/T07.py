import sys

def sum_major_diagonal(matrix):
    diagonal_sum = 0
    for i in range(4):
        diagonal_sum += matrix[i][i]
    return diagonal_sum

if __name__ == "__main__":
    matrix = []
    print("Enter a 4-by-4 matrix row by row:")
    for _ in range(4):
        row = [float(x) for x in input().split()]
        matrix.append(row)
    
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(matrix)}")

