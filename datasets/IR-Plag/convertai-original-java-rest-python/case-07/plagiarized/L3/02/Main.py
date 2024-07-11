import numpy as np

def sum_major_diagonal(mtx):
    return np.trace(mtx)

if __name__ == "__main__":
    mtx = np.zeros((4, 4))
    print("Enter a 4 by 4 matrix row by row: ", end="")
    mtx = np.array([list(map(float, input().split())) for _ in range(4)])
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(mtx)}")

