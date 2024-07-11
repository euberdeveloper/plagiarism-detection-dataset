def reverse(number):
    a = str(number)
    print(''.join(reversed(a)))

if __name__ == '__main__':
    number = int(input("Enter an integer: "))
    reverse(number)

