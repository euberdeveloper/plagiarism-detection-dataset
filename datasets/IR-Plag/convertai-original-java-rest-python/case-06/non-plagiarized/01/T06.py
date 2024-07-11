import sys

input_list = []

for i in range(10):
    num = int(input("Read a number: "))
    input_list.append(num)

for i in range(9, -1, -1):
    print(input_list[i])

