import sys

def reverse(number):
    print(number % 10, end='')

def main():
    print("Enter an integer: ", end='')
    number = int(input())
    
    while number > 0:
        reverse(number)
        number //= 10
    print()

if __name__ == "__main__":
    main()

