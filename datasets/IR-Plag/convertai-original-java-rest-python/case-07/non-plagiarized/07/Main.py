import sys
from decimal import Decimal, ROUND_HALF_UP

def main():
    a = []
    for i in range(4):
        row = [float(x) for x in input().split()]
        a.append(row)

    for i in range(4):
        for j in range(4):
            if a[i][j].is_integer():
                print(f"{a[i][j]:.0f}", end=" ")
            else:
                print(f"{a[i][j]}", end=" ")
        print()

    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(a)}")

def sum_major_diagonal(array):
    total = 0
    for i in range(len(array)):
        total += array[i][i]
    return total

if __name__ == "__main__":
    main()

