import sys

def reverse(number):
    balik = ""
    while number > 0:
        balik += str(number % 10)
        number //= 10
    print(balik)

if __name__ == "__main__":
    number = int(input("Enter an integer: "))
    reverse(number)

