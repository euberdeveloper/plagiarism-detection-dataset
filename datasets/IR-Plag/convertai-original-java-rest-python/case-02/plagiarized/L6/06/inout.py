import math

def main():
    rad, l = map(float, input("Enter the radius and length of a cylinder: ").split())
    area = calculate_area(rad)
    calculate_volume(area, l)

def calculate_area(rad):
    area = rad * rad * math.pi
    print(f"The area is {area}")
    return area

def calculate_volume(area, l):
    volume = area * l
    print(f"The volume of the cylinder is {volume}")

if __name__ == "__main__":
    main()

