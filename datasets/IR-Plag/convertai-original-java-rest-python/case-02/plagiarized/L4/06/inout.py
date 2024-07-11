import math

def hitung_vol(ar, l):
    return ar * l

def hitung_ar(rad):
    return rad * rad * math.pi

def main():
    rad, l, ar, vol = 0.0, 0.0, 0.0, 0.0
    
    print("Enter the radius and length of a cylinder : ", end="")
    rad = float(input())
    l = float(input())
    
    ar = hitung_ar(rad)
    vol = hitung_vol(ar, l)
    
    print(f"The area is {ar}")
    print(f"The volume of the cylinder is {vol}")

if __name__ == "__main__":
    main()

