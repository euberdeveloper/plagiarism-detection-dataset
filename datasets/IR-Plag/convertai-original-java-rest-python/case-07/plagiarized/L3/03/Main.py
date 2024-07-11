import numpy as np

def hasil_pertambahan_diagonal(m):
    return np.sum(np.diag(m))

if __name__ == "__main__":
    n = np.array([list(map(float, input("Enter a 4 by 4 matrix row by row: ").split())) for _ in range(4)])
    print(f"Sum of the elements in the major diagonal is {hasil_pertambahan_diagonal(n)}")

