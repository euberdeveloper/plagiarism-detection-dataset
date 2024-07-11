import sys

def input_arr(arr):
    arr2 = [0] * 10
    for x in range(10):
        arr[x] = int(input("Read a number: "))
    for i in range(10):
        arr2[i] = arr[9 - i]
    return arr2

def print_arr(arr):
    for x in range(10):
        print(arr[x])

def main():
    arr = [0] * 10
    print_arr(input_arr(arr))

if __name__ == "__main__":
    main()

