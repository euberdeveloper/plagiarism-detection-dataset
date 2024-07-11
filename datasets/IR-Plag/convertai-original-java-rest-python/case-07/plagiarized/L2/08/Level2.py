import numpy as np

def main():
    matrix = np.array([list(map(float, input("Enter a 4 by 4 matrix row by row: ").split())) for _ in range(4)])
    print(f"Sum of the elements in the major diagonal is {calculate_diagonal(matrix)}")

def calculate_diagonal(matrix):
    return np.trace(matrix)

if __name__ == "__main__":
    main()

