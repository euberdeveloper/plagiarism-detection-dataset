import sys

def main():
    number = int(input("Enter an integer: "))
    
    while number != 0:
        remainder = number % 10
        print(remainder, end="")
        number //= 10
    
    print()

if __name__ == "__main__":
    main()

