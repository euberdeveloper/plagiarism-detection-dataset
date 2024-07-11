import sys

def reverse(number):
    return number % 10

def main():
    print("Enter an integer: ", end="")
    number = int(input())
    
    while number > 0:
        print(reverse(number), end="")
        number //= 10
    print()

if __name__ == "__main__":
    main()

