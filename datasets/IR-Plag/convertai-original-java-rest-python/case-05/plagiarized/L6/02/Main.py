import sys

def input():
    print("Enter an integer: ", end="")
    return int(input())

def reverse(nmb):
    rev = str(nmb)
    for i in range(len(rev), 0, -1):
        print(rev[i-1], end="")
    print()

def main():
    nmb = input()
    reverse(nmb)

if __name__ == "__main__":
    main()

