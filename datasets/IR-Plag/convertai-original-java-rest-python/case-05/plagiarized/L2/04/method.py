import sys

def main():
    print("Enter an integer: ", end="")
    n = int(input())
    beauty_reverse(n)

def beauty_reverse(num):
    while num != 0:
        r = num % 10
        print(r, end="")
        num //= 10
    print()

if __name__ == "__main__":
    main()

