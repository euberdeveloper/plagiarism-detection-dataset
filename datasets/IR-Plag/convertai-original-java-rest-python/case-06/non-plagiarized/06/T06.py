import sys

numbers = []
for i in range(10):
    num = int(input(f"Read a number: "))
    numbers.append(num)

for num in reversed(numbers):
    print(num)

