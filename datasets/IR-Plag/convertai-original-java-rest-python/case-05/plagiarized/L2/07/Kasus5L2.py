import sys

def reverse_number(angka):
    #proses membalikkan angka
    while angka != 0:
        #mengambil angka terakhir
        temp = angka % 10
        #tampilkan angka yang diambil
        print(temp, end='')
        #membuang angka terakhir
        angka = angka // 10
    print()

if __name__ == "__main__":
    #input data
    angka = int(input("Enter an integer: "))
    reverse_number(angka)

