import sys

arr = [0] * 10
for i in range(10):
    print("Read a number: ", end="")
    arr[i] = int(input())

for i in range(9, -1, -1):
    print(arr[i])

