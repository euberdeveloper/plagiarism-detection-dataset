import math

rad = 0.0
panjang = 0.0

def input():
    global rad, panjang
    rad = float(input("Enter the radius and length of a cylinder: "))
    panjang = float(input())

def hitArea():
    return rad * rad * math.pi

def main():
    # masukan silinder
    input()
    
    a = hitArea()
    vol = a * panjang
    
    # cetak hasil
    print("The area is", a)
    print("The volume of the cylinder is", vol)

if __name__ == "__main__":
    main()

