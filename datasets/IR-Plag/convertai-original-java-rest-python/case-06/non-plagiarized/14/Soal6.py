import sys

def reverse(number):
    for i in range(len(number)-1, -1, -1):
        print(number[i])

if __name__ == "__main__":
    input_str = ""
    for i in range(10):
        a = int(input("Read a number: "))
        input_str += str(a)
    reverse(input_str)

