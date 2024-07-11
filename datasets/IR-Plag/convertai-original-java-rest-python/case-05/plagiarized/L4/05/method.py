import sys

def beauty_reverse(num):
    while num != 0:
        r = num % 10
        print(r, end='')
        num = num // 10
    print()

def reverse(n):
    beauty_reverse(n)

if __name__ == "__main__":
    print("Enter an integer: ", end="")
    n = int(input())
    reverse(n)

