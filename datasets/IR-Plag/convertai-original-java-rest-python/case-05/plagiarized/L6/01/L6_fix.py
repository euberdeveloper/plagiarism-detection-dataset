# Import necessary libraries
import sys

def main():
    # Get user input
    print("Enter an integer: ", end="")
    nomor = int(input())
    
    # Initialize variables
    sisa = 0
    
    # Reverse the number
    while nomor != 0:
        sisa = nomor % 10
        print(sisa, end="")
        nomor //= 10
    
    print()

if __name__ == "__main__":
    main()

