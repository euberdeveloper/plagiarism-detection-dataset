import sys

def main():
    angka = int(input("Enter an integer: "))
    
    while angka != 0:
        sisaBagi = angka % 10
        print(sisaBagi, end="")
        angka //= 10
    
    print()

if __name__ == "__main__":
    main()

