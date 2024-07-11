import sys

def reverse_number(angka):
    # Process to reverse the number
    while angka != 0:
        # Get the last digit
        temp = angka % 10
        # Remove the last digit
        angka = angka // 10
        # Print the extracted digit
        print(temp, end='')
    print()

if __name__ == "__main__":
    # Get input data
    angka = int(input("Enter an integer: "))
    reverse_number(angka)

