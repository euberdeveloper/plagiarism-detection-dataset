import sys

# input data
angka = int(input("Enter an integer: "))

# process to reverse the number
reversed_num = 0
while angka != 0:
    # get the last digit
    temp = angka % 10
    # remove the last digit
    angka //= 10
    # display the extracted digit
    print(temp, end="")

print()

