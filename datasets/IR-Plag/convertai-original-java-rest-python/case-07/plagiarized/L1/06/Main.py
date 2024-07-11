import numpy as np

def sum_major_diagonal(m):
    # Sum the elements in the major diagonal
    return np.trace(m)

if __:
    # Get input matrix from user
    print("Enter a 4 by 4 matrix row by row:")
    m = np.array([list(map(float, input().split())) for _ in range(4)])

    # Print the sum of the major diagonal
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(m)}")

