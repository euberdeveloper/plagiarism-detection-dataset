import numpy as np

def diagonal(x):
    jumlah = 0
    for i in range(len(x)):
        jumlah += x[i][i]
    return jumlah

if __name__ == "__main__":
    matriks = np.array([list(map(float, input("Enter a 4 by 4 matrix row by row: ").split())) for _ in range(4)])
    print(f"Sum of the elements in the major diagonal is {diagonal(matriks)}")

