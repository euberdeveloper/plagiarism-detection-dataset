import sys

def reverse(angka):
    # Here we loop until the number is exhausted
    while angka != 0:
        remainder = angka % 10
        print(remainder, end='')
        angka = angka // 10
    print()

if __name__ == '__main__':
    print("Enter an integer: ", end='')
    angka = int(input())
    # Calling the reverse function to reverse the generated value
    reverse(angka)

