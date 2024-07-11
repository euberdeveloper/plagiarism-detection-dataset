import sys

# masukkan data
number = []
for a in range(10):
    print("Read a number: ", end="")
    number.append(int(input()))

# tampilkan ke layar
for a in range(9, -1, -1):
    print(number[a])

