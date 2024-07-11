import sys

def simpan_array(arr, n):
    sc = input
    for i in range(n):
        print("Read a number: ", end="")
        arr[i] = int(sc())

def tampil_array(arr, n):
    for i in range(n-1, -1, -1):
        print(arr[i])

def main():
    n = 10
    arr = [0] * n
    simpan_array(arr, n)
    tampil_array(arr, n)

if __name__ == "__main__":
    main()

