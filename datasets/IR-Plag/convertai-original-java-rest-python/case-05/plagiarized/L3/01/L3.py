import sys

def balik(nomor):
    sisa = 0
    while nomor != 0:
        sisa = nomor % 10
        print(sisa, end='')
        nomor = nomor // 10
    print()

def main():
    print("Enter an integer: ", end='')
    nomor = int(input())
    balik(nomor)

if __name__ == "__main__":
    main()

