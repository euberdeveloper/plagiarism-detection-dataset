import numpy as np

def sum_major_diagonal(m):
    return np.trace(m)

def main():
    m = np.array([list(map(float, input("Enter a 4 by 4 matrix row by row: ").split())) for _ in range(4)])
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(m)}")

if __name__ == "__main__":
    main()

