import sys

def rekursif(bil):
    if bil != 0:
        sisa_mod = bil % 10
        print(sisa_mod, end='')
        bil = bil // 10
        rekursif(bil)
    return bil

if __name__ == "__main__":
    print("Enter an integer: ", end='')
    bil = int(input())
    rekursif(bil)
    print()

