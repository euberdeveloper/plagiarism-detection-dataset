import sys

arrAngka = [0] * 10

for x in range(10):
    print("Read a number: ", end="")
    arrAngka[x] = int(input())

for x in range(9, -1, -1):
    print(arrAngka[x])

