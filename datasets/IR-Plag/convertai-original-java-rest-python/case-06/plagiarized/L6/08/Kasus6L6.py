import sys

def main():
    # Delarasi
    arr_num = [0] * 10
    inp = sys.stdin

    # for untuk 10 kali input
    for i in range(9, -1, -1):
        # Read a number
        print("Read a number: ", end="")
        arr_num[i] = int(inp.readline().strip())

    # Display the array
    reverse(arr_num)

def reverse(arr):
    for num in arr:
        print(num)

if __name__ == "__main__":
    main()

