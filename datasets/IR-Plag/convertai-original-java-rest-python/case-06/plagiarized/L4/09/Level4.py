import sys

def proses():
    angka = [0] * 10
    for a in range(10):
        print("Read a number: ", end="")
        angka[a] = int(input())

    for b in range(9, -1, -1):
        print(angka[b])

if __name__ == "__main__":
    proses()

