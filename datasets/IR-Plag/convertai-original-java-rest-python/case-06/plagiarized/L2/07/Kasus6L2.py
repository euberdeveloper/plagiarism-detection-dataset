import sys

# Deklarasi
arr_num = [0] * 10

# for untuk 10 kali input
for i in range(10):
    # Read a number
    print("Read a number: ", end="")
    arr_num[i] = int(input())

# Display the array
for i in range(9, -1, -1):
    # Print angka dalam array
    print(arr_num[i])

