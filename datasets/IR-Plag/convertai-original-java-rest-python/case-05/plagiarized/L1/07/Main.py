import sys

def reverse(number):
    # Here we loop until number is exhausted
    while number != 0:
        remainder = number % 10
        print(remainder, end='')
        number = number // 10
    print()

if __name__ == '__main__':
    print("Enter an integer: ", end='')
    number = int(input())
    # Calling the reverse function to reverse the generated value
    reverse(number)

