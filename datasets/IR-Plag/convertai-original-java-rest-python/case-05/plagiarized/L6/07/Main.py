import sys

def main():
    print("Enter an integer: ", end="")
    angka = int(input())
    # Call the reverse function to reverse the generated value
    while angka > 0:
        remainder = angka % 10
        print(remainder, end="")
        angka //= 10
    print()

if __name__ == "__main__":
    main()

