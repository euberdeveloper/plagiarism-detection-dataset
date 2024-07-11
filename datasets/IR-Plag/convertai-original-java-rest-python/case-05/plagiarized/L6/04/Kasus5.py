def reverse(number):
    if number > 0:
        print(number % 10, end='')
        reverse(number // 10)

print("Enter an integer: ", end='')
number = int(input())

reverse(number)
print()

