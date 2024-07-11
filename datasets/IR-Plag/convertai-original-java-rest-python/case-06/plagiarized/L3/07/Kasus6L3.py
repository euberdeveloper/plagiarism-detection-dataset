import sys

# Delarasi
arrNum = [0] * 10
inp = sys.stdin

# for untuk 10 kali input
for i in range(10):
    # Read a number
    print("Read a number: ", end="")
    arrNum[i] = int(inp.readline().strip())

# Display the array
for i in range(9, -1, -1):
    # Print angka dalam array
    print(arrNum[i])

