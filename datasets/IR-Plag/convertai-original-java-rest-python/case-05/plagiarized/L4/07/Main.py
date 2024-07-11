import sys

angka = int(input("Enter an integer: "))

# Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
while angka != 0:
    remainder = angka % 10
    print(remainder, end="")
    angka //= 10

print()

