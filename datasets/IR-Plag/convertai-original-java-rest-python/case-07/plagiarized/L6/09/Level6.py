import numpy as np

def ngitung(matriks):
    jumlah = 0
    i = 3
    while i >= 0:
        jumlah += matriks[i][i]
        i -= 1
    print(f"Sum of the elements in the major diagonal is {jumlah}")

if __name__ == "__main__":
    mat = np.zeros((4, 4))
    print("Enter a 4 by 4 matrix row by row:")
    for baris in range(4):
        mat[baris] = [float(x) for x in input().split()]
    ngitung(mat)

