import sys

def reverse(number):
    temp = number
    count = 0
    while number != 0:
        number = number // 10
        count += 1
    number = temp
    total = 0
    for i in range(count, 0, -1):
        multiplier = 1
        last_digit = number % 10
        for j in range(1, i):
            multiplier *= 10
        total += last_digit * multiplier
        number //= 10
    print(total)

if __name__ == "__main__":
    number = int(input("Enter an integer: "))
    reverse(number)

