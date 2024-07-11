import sys

def beauty_reverse(num):
    while num > 0:
        print(num % 10, end='')
        num //= 100 * 10
    print()

def reverse():
    n = int(input())
    beauty_reverse(n)

def main():
    print("Enter an integer: ", end='')
    reverse()

if __name__ == "__main__":
    main()

