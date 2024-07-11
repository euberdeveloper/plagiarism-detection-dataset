import sys

def main():
    a = int(input("Enter an integer: "))
    b = str(a)
    for i in range(len(b)-1, -1, -1):
        print(b[i], end="")

if __name__ == "__main__":
    main()

