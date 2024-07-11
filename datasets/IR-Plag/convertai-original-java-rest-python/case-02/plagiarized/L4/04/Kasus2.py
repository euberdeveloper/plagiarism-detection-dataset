import math

def hitung_area(r):
    return r * r * math.pi

def hitung_volume(r, l):
    return hitung_area(r) * l

if __name__ == "__main__":
    r, l = map(float, input("Enter the radius and length of a cylinder: ").split())
    print(f"The area is {hitung_area(r)}")
    print(f"The volume of the cylinder is {hitung_volume(r, l)}")

