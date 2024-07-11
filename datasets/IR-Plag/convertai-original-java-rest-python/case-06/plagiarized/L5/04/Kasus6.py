import sys

def simpanArray(arr, n):
    sc = sys.stdin
    for i in range(n):
        print("Read a number: ", end="")
        arr[i] = int(sc.readline().strip())

def tampilArray(arr, i):
    print(arr[i])

if __name__ == "__main__":
    n = 10
    arr = [0] * n
    simpanArray(arr, n)
    for i in range(n-1, -1, -1):
        tampilArray(arr, i)

