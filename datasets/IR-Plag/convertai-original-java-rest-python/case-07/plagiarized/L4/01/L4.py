import numpy as np

def jumlah_diagonal(m):
    return np.trace(m)

def print_result(m):
    print(f"Sum of the elements in the major diagonal is {jumlah_diagonal(m)}")

if __name__ == "__main__":
    m = np.array([list(map(float, input(f"Enter row {i+1}: ").split())) for i in range(4)])
    print_result(m)

