import sys

def terbalik(angka):
    while angka != 0:
        sisa = angka % 10
        print(sisa, end='')
        angka = angka // 10
    print()

if __name__ == "__main__":
    print("Enter an integer: ", end='')
    input_int = int(sys.stdin.readline().strip())
    terbalik(input_int)

