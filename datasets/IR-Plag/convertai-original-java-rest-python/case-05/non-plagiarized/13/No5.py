import sys

def reverse(a):
    for i in range(len(a)-1, -1, -1):
        print(a[i], end='')

if __name__ == "__main__":
    inp = input("Enter an integer: ")
    reverse(inp)

