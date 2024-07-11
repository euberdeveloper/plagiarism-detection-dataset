# Import necessary libraries
import sys

# Get user input
print("Enter an integer: ", end="")
nomor = int(input())

# Reverse the number
while nomor != 0:
    sisa = nomor % 10
    print(sisa, end="")
    nomor //= 10

print()

