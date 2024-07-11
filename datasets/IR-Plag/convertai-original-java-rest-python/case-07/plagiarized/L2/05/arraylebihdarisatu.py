import numpy as np

def main():
    matrix = []
    print("Enter a 4 by 4 matrix row by row: ", end="")
    for _ in range(4):
        row = [float(x) for x in input().split()]
        matrix.append(row)
    
    matrix = np.array(matrix)
    print(f"Sum of the elements in the major diagonal is {calculate_diagonal(matrix)}")

def calculate_diagonal(matrix):
    return np.trace(matrix)

if __name__ == "__main__":
    main()

