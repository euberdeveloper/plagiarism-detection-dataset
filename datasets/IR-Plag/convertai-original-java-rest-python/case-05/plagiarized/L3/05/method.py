import java.util.Scanner

def beautyReverse(num):
    while num != 0:
        r = num % 10
        print(r, end='')
        num = num // 10
    print()

def main():
    print("Enter an integer: ", end='')
    n = int(input())
    beautyReverse(n)

if __name__ == "__main__":
    main()

