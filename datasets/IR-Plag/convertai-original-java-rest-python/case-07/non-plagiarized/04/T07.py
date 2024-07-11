import numpy as np

def sum_major_diagonal(matrix):
    return np.trace(matrix)

def main():
    print("Enter a 4-by-4 matrix row by row")
    matrix = np.array([list(map(float, input().split())) for _ in range(4)])
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(matrix)}")

if __name__ == "__main__":
    main()

