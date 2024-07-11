import sys

def balik(angka):
    while angka != 0:
        sisa = angka % 10
        print(sisa, end='')
        angka = angka // 10
    print()

if __name__ == '__main__':
    print("Enter an integer: ", end='')
    angka = int(input())
    balik(angka)

