import math

def hitung_area(r):
    return r * r * math.pi

def main():
    r, l = map(float, input("Enter the radius and length of a cylinder: ").split())
    
    print("The area is", hitung_area(r))
    print("The volume of the cylinder is", hitung_area(r) * l)

if __name__ == "__main__":
    main()

