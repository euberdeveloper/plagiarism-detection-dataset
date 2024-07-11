import sys

def main():
    print("Enter an integer: ", end="")
    input_num = int(input())
    
    while input_num != 0:
        remainder = input_num % 10
        print(remainder, end="")
        input_num //= 10

if __name__ == "__main__":
    main()

