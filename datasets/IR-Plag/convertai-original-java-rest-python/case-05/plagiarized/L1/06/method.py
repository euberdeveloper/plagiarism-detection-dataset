import sys

def reverse(number):
    while number != 0:
        remainder = number % 10
        print(remainder, end='')
        number = number // 10
    print()

if __name__ == "__main__":
    print("Enter an integer: ", end='')
    number = int(input())
    reverse(number)

