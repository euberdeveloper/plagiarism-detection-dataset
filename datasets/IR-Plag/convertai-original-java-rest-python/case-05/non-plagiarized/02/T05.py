import sys

def reverse(number):
    temp = str(number)
    for i in range(len(temp), 0, -1):
        print(temp[i-1], end='')

if __name__ == "__main__":
    a = int(input("Enter a integer: "))
    reverse(a)

