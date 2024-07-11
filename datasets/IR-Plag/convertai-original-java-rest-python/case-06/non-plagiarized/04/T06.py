import sys

a = [int(input(f"Read a number: ")) for _ in range(10)]
for num in reversed(a):
    print(num)

