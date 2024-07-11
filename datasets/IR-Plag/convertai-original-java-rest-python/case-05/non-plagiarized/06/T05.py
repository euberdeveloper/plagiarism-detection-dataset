import sys

def reverse(number):
    number_string = str(number)
    for i in range(len(number_string), 0, -1):
        print(number_string[i-1], end='')
    print()

if __name__ == "__main__":
    number = int(input("Enter an integer: "))
    reverse(number)

