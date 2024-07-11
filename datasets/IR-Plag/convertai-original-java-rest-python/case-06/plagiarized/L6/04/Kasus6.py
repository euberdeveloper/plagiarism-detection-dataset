import sys

def simpan_array(arr, i):
    sc = sys.stdin
    if i > 0:
        simpan_array(arr, i - 1)
        print("Read a number: ", end="")
        arr[i - 1] = int(sc.readline().strip())

def tampil_array(arr, i):
    if i >= 0:
        print(arr[i])
        tampil_array(arr, i - 1)

def main():
    n = 10
    arr = [0] * n
    simpan_array(arr, n)
    tampil_array(arr, n - 1)

if __name__ == "__main__":
    main()

