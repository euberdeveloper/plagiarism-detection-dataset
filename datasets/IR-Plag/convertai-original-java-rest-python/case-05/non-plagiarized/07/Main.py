import sys

def reverse(number):
    temp_digit = 0
    while number > 0:
        temp_digit = number % 10
        print(temp_digit, end='')
        number = number // 10

if __name__ == '__main__':
    number = int(input("Enter an integer: "))
    reverse(number)

