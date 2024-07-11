import sys

def tampil(angka):
    for x in range(9, -1, -1):
        print(angka[x])

def main():
    arrAngka = [0] * 10

    for x in range(len(arrAngka)):
        print("Read a number: ", end="")
        arrAngka[x] = int(input())

    tampil(arrAngka)

if __name__ == "__main__":
    main()

