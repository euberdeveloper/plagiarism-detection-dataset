import sys

array = [int(input(f"Read a number: ")) for _ in range(10)]
for num in reversed(array):
    print(num)

