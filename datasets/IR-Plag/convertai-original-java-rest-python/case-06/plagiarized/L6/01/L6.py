import sys

def print_array(arr):
    i = 9
    j = 0
    while j < 10:
        print(arr[i])
        i -= 1
        j += 1

if __name__ == "__main__":
    angka = [0] * 10
    i = 0
    while i != 10:
        print("Read a number: ", end="")
        angka[i] = int(input())
        i += 1

    print_array(angka)

