import sys

# Read a number: 
arr_num = [int(input("Read a number: ")) for _ in range(10)]

for num in reversed(arr_num):
    print(num)

