import sys

def main():
    # Delarasi
    arr_num = [0] * 10
    inp = sys.stdin

    # for untuk 10 kali input
    for i in range(10):
        # Read a number
        print("Read a number: ", end="")
        arr_num[i] = int(inp.readline().strip())

    # Display the array
    reverse(arr_num)

def reverse(arr):
    for i in range(len(arr) - 1, -1, -1):
        # Print angka dalam array
        print(arr[i])

if __name__ == "__main__":
    main()

