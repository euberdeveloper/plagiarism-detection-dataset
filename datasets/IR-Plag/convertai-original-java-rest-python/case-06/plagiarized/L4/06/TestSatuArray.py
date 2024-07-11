import sys

def inputArr(arr):
    for x in range(10):
        print("Read a number: ", end="")
        arr[x] = int(input())
    return arr

def printArr(arr):
    for x in range(9, -1, -1):
        print(arr[x])

def main():
    arr = [0] * 10
    arr = inputArr(arr)
    printArr(arr)

if __name__ == "__main__":
    main()

