import math

def main():
    radius, height = map(float, input("Enter the radius and length of a cylinder: ").split())
    count(radius, height)

def count(rad, height):
    print(f"The area is {math.pow(rad, 2) * math.pi}")
    print(f"The volume of the cylinder is {math.pow(rad, 2) * math.pi * height}")

if __name__ == "__main__":
    main()

