import sys

def reverse(nmb):
    get = 0
    while nmb != 0:
        get = nmb % 10
        print(get, end='')
        nmb = nmb // 10
    print()

if __name__ == '__main__':
    nmb = int(input("Enter an integer: "))
    reverse(nmb)

