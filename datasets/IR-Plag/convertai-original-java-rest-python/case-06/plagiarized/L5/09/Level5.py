import sys

# Read a number: 
arr_angka = [int(input("Read a number: ")) for _ in range(10)]

for x in range(9, -1, -1):
    print(arr_angka[x])

