import numpy as np

def sum_major_diagonal(m):
    hasil = 0
    for i in range(4):
        for j in range(4):
            if i == j:
                hasil += m[i][j]
    return hasil

if __name__ == "__main__":
    m = np.zeros((4, 4))
    for i in range(4):
        for j in range(4):
            m[i][j] = float(input())
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(m)}")

