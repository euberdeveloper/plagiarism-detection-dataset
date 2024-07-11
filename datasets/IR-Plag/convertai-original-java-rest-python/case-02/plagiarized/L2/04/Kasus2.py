import math

def hitung_area(r):
    return r * r * math.pi

def hitung_volume(area, l):
    return area * l

if __name__ == "__main__":
    r, l = map(float, input("Enter the radius and length of a cylinder: ").split())
    area = hitung_area(r)
    volume = hitung_volume(area, l)
    print(f"The area is {area}")
    print(f"The volume of the cylinder is {volume}")

