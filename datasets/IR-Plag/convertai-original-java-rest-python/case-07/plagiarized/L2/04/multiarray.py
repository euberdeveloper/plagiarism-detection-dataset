import sys

def main():
    print("Enter a 4 by 4 matrix row by row: ", end="")
    ma = [[float(input()) for _ in range(4)] for _ in range(4)]
    print(f"Sum of the elements in the major diagonal is {sum_diagonal(ma)}")

def sum_diagonal(m):
    return sum(m[i][i] for i in range(len(m)))

if __name__ == "__main__":
    main()

