import sys

def reverse(number):
    cek = str(number)
    for i in range(len(cek)):
        print(cek[len(cek)-1-i], end='')
    print()

if __name__ == '__main__':
    a = int(input("Enter an integer "))
    reverse(a)

