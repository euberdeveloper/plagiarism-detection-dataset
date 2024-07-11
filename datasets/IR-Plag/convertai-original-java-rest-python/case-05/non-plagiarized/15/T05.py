import math

def reverse(number):
    a = 0
    i = int(math.log10(number))
    while number != 0:
        b = number % 10
        a += b * 10 ** i
        i -= 1
        number //= 10
    print(int(a))

if __name__ == "__main__":
    inp = int(input("Enter an integer: "))
    reverse(inp)

