import sys

def main():
    angka = [0] * 10
    input_reader = sys.stdin
    for i in range(10):
        print("Read a number: ", end="")
        angka[i] = int(input_reader.readline().strip())
    show_array(angka)

def show_array(angka):
    for i in range(9, -1, -1):
        print(angka[i])

if __name__ == "__main__":
    main()

