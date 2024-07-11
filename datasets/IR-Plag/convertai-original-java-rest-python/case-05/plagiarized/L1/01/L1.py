import sys

def reverse(number):
    while number != 0:
        remainder = number % 10
        print(remainder, end='')
        number = number // 10
    print()

def main():
    print("Enter an integer: ", end='')
    number = int(input())
    reverse(number)

if __name__ == "__main__":
    main()

