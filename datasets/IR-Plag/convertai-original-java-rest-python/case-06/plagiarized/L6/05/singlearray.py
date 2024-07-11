import sys

n = [0] * 10

def main():
    for i in range(10):
        n[i] = int(input("Read a number: "))
    print_array()

def print_array():
    for i in range(10):
        print(n[9-i])

if __name__ == "__main__":
    main()

