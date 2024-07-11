import sys

def reverse(number):
    tmp_number = str(number)
    for i in range(len(tmp_number) - 1, -1, -1):
        print(tmp_number[i], end='')
    print()

if __name__ == '__main__':
    num = int(input("Enter an integer: "))
    reverse(num)

