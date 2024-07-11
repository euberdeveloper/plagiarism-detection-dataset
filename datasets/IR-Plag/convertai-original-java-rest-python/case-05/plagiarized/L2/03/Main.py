def balik(number):
    while number != 0:
        remainder = number % 10
        print(remainder, end='')
        number //= 10
    print()

if __name__ == '__main__':
    print("Enter an integer: ", end='')
    number = int(input())
    balik(number)

