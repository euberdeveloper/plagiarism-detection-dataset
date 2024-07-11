import sys

def inputArr(arr):
    for x in range(10):
        arr[x] = int(input("Read a number: "))
    return arr

def printArr(arr):
    for x in range(9, -1, -1):
        print(arr[x])

if __name__ == "__main__":
    arr = [0] * 10
    arr = inputArr(arr)
    printArr(arr)

