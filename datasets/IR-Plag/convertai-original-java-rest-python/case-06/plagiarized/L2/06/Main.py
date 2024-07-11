import sys

angka = []
for i in range(10):
    print("Read a number: ", end="")
    angka.append(int(input()))

for i in range(9, -1, -1):
    print(angka[i])

