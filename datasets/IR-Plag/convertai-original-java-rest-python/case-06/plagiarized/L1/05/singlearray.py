import sys

def main():
    num = [0] * 10  # initialize array
    for i in range(10):  # loop for input array
        print("Read a number: ", end="")
        num[i] = int(input())  # input to array
    for i in range(9, -1, -1):  # loop for displaying array
        print(num[i])  # display array

if __name__ == "__main__":
    main()

