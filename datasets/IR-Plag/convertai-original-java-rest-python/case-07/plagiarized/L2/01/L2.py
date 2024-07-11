import numpy as np

def jumlahDiagonal(m):
    sum = 0
    for i in range(len(m)):
        sum += m[i][i]
    return sum

if __name__ == "__main__":
    m = np.array([list(map(float, input("Enter a 4 by 4 matrix row by row: ").split())) for _ in range(4)])
    print(f"Sum of the elements in the major diagonal is {jumlahDiagonal(m)}")

