import sys

n = [0] * 10

for i in range(10):
    print("Read a number: ", end="")
    n[i] = int(input())

for a in range(9, -1, -1):
    print(n[a])

