import sys

def main():
    print("Enter a 4 by 4 matrix row by row: ", end="")
    n = []
    for i in range(4):
        row = [float(x) for x in input().split()]
        n.append(row)

    print(f"Sum of the elements in the major diagonal is {hasil_pertambahan_diagonal(n)}")

def hasil_pertambahan_diagonal(m):
    sum = 0
    for i in range(len(m)):
        sum += m[i][i]
    return sum

if __name__ == "__main__":
    main()

