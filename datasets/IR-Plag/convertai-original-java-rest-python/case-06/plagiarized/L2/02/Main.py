import sys

numbers = []

for i in range(10):
    print("Read a number: ", end="")
    numbers.append(int(input()))

for num in reversed(numbers):
    print(num)

