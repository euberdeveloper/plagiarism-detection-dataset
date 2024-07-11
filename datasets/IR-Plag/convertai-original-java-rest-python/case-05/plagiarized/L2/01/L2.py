import sys

def balik(nomor):
    while nomor != 0:
        sisa = nomor % 10
        print(sisa, end='')
        nomor = nomor // 10
    print()

if __name__ == '__main__':
    print("Enter an integer: ", end='')
    nomor = int(input())
    balik(nomor)

