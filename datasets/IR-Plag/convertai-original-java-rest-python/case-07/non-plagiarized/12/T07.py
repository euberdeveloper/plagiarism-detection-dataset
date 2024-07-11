import numpy as np

def sum_major_diagonal(m):
    return np.trace(m)

if __name__ == "__main__":
    m = np.array([list(map(float, input(f"Enter row {i+1} of the 4x4 matrix: ").split())) for i in range(4)])
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(m)}")

