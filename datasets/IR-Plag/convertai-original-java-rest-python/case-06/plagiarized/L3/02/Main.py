import sys

# Read the numbers
numbers = []
for i in range(10):
    print("Read a number: ", end="")
    num = int(input())
    numbers.append(num)

# Output the numbers in reverse order
for i in range(9, -1, -1):
    print(numbers[i])

