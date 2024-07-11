import sys

def reverse(number):
    angka = str(number)
    print(''.join(reversed(angka)), end='')

if __name__ == '__main__':
    number = int(input("Enter an integer: "))
    reverse(number)

