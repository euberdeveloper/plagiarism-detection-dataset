import sys

a = [int(input(f"Read a number {i+1}: ")) for i in range(10)]
for i in range(9, -1, -1):
    print(a[i])

