import sys

number = int(input("Enter an integer: "))

while number != 0:
    remainder = number % 10
    print(remainder, end="")
    number //= 10

print()
