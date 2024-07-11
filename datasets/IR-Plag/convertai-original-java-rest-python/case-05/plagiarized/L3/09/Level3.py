import sys

def reverse(number):
    while number != 0:
        remainder = number % 10
        print(remainder, end='')
        number //= 10
    print()

if __name__ == '__main__':
    angka = int(input("Enter an integer: "))
    reverse(angka)

