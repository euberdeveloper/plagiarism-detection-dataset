import sys

def print_number(number):
    for i in range(9, -1, -1):
        print(number[i])

def main():
    number = [0] * 10
    for i in range(10):
        print("Read a number: ", end="")
        number[i] = int(input())
    
    print_number(number)

if __name__ == "__main__":
    main()

