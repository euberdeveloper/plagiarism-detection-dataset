import numpy as np

def sum(x):
    jumlah = 0
    for i in range(4):
        jumlah += x[i][i]
    return jumlah

def hasil(x):
    print(f"Sum of the elements in the major diagonal is {sum(x)}")

if __name__ == "__main__":
    matriks = np.array([list(map(float, input("Enter a 4 by 4 matrix row by row: ").split())) for _ in range(4)])
    hasil(matriks)

