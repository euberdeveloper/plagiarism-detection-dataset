import sys

# input data
angka = int(input("Enter an integer: "))

# process to reverse the number
while angka != 0:
    # display the extracted digit
    print(angka % 10, end="")
    # discard the last digit
    angka //= 10

print()

