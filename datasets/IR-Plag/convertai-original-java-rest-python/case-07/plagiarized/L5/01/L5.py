import numpy as np

def jumlah_diagonal(m):
    sum = 0
    hit = 0
    while hit != len(m):
        sum += m[hit][hit]
        hit += 1
    return sum

def print_result(m):
    print(f"Sum of the elements in the major diagonal is {jumlah_diagonal(m)}")

if __name__ == "__main__":
    m = np.array([list(map(float, input(f"Enter row {i+1} of the 4x4 matrix: ").split())) for i in range(4)])
    print_result(m)

