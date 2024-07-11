import sys

def print_array(arr):
    for i in range(len(arr)-1, -1, -1):
        print(arr[i])

def main():
    angka = [0] * 10
    for i in range(10):
        print("Read a number: ", end="")
        angka[i] = int(input())
    
    print_array(angka)

if __name__ == "__main__":
    main()

