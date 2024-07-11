import sys

def print_number(number):
    for i in number:
        print(i)

def main():
    number = [0] * 10
    for i in range(9, -1, -1):
        print("Read a number: ", end="")
        number[i] = int(input())
    
    print_number(number)

if __name__ == "__main__":
    main()

