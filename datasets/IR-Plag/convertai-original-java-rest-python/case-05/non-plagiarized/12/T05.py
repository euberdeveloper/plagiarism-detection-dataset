import sys

def reverse(number):
    reverse = 0
    while number != 0:
        reverse = reverse * 10
        reverse = reverse + number % 10
        number = number // 10
    print(reverse)

if __name__ == "__main__":
    a = int(input("Enter an integer: "))
    reverse(a)

