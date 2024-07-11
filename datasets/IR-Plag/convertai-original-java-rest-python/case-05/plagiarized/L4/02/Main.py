import sys

def input():
    print("Enter an integer: ", end="")
    return int(input())

def reverse(nmb):
    get = 0
    while nmb != 0:
        get = nmb % 10
        print(get, end="")
        nmb = nmb // 10
    print()

def main():
    nmb = input()
    reverse(nmb)

if __name__ == "__main__":
    main()

