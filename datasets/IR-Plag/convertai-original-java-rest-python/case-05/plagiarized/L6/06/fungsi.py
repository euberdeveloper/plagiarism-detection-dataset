import sys

def terbalik(angka):
    arr = []
    while angka > 0:
        sisa = angka % 10
        arr.append(sisa)
        angka //= 10
    for digit in arr:
        print(digit, end='')
    print()

if __name__ == "__main__":
    print("Enter an integer: ", end='')
    input_num = int(input())
    terbalik(input_num)

