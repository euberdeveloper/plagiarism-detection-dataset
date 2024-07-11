import sys

def print_array(arr):
    for i in range(9, -1, -1):
        print(arr[i])

if __name__ == "__main__":
    angka = [0] * 10
    for i in range(10):
        print("Read a number: ", end="")
        angka[i] = int(input())

    print_array(angka)

