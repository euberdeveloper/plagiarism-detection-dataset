import numpy as np

def input_data(mtx):
    for i in range(4):
        for j in range(4):
            mtx[i][j] = float(input())

def sum_major_diagonal(mtx):
    return np.trace(mtx)

if __name__ == "__main__":
    mtx = np.zeros((4, 4))
    print("Enter a 4 by 4 matrix row by row:")
    input_data(mtx)
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(mtx)}")

