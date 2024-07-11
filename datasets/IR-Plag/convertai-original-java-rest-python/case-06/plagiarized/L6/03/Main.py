import sys

nums = [0] * 10

for i in range(10, -1, -1):
    # Read a number
    nums[i] = int(input("Read a number: "))

i = 9
while i >= 0:
    print(nums[i])
    i -= 1

