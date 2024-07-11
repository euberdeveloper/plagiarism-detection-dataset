import sys

def terbalik(angka):
    while angka > 0:
        sisa = angka % 10
        print(sisa, end='')
        angka //= 10
    print()

if __name__ == "__main__":
    print("Enter an integer: ", end='')
    input_num = int(input())
    terbalik(input_num)

