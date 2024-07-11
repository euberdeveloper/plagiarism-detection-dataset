import sys

numbers = []
for i in range(10):
    print("Read a number: ", end="")
    numbers.append(int(input()))

for i in range(9, -1, -1):
    print(numbers[i])

