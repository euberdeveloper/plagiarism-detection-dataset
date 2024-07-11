import sys

def reverse(number):
    #proses membalikkan angka
    while number != 0:
        #mengambil angka terakhir
        remainder = number % 10
        #tampilkan angka yang diambil
        print(remainder, end='')
        #membuang angka terakhir
        number = number // 10
    print()

if __name__ == "__main__":
    #input data
    number = int(input("Enter an integer: "))
    reverse(number)

