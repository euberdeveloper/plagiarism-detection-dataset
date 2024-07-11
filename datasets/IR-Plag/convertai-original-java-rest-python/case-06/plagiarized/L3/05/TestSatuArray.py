import sys

arr = [int(input(f"Read a number: ")) for _ in range(10)]
for x in range(9, -1, -1):
    print(arr[x])

