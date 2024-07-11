import sys

def reverse(number):
    str_number = str(number)
    temp = ""
    for i in range(len(str_number), 0, -1):
        temp += str(i)
    temp_number = int(temp)
    print(temp_number)

if __name__ == "__main__":
    number = int(input("Enter an integer: "))
    reverse(number)

