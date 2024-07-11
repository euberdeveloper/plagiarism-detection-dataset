import sys

def reverse(number):
    while number > 0:
        print(number % 10, end='')
        number //= 10
    print()

if __name__ == '__main__':
    number = int(input("Enter an integer: "))
    reverse(number)

