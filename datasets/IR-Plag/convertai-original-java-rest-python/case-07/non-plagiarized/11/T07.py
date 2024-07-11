import numpy as np

def sum_major_diagonal(arr):
    total = np.trace(arr)
    print(f"Sum of the elements in the major diagonal is {total}")
    return total

if __name__ == "__main__":
    arr = np.array([list(map(float, input("Enter a 4-by-4 row by row: ").split())) for _ in range(4)])
    sum_major_diagonal(arr)

