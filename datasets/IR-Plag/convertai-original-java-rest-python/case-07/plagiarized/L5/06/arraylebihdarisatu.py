import sys

def HitungDiagonal(matrix):
    total = 0
    for i in range(len(matrix)):
        total += matrix[i][i]
    return total

if __name__ == "__main__":
    matrix = []
    print("Enter a 4 by 4 matrix row by row: ", end="")
    for _ in range(4):
        row = [float(x) for x in input().split()]
        matrix.append(row)

    result = HitungDiagonal(matrix)
    print(f"Sum of the elements in the major diagonal is {result}")

