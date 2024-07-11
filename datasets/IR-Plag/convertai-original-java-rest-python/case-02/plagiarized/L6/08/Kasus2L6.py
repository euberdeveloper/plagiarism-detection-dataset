import math

def main():
    # Enter radius of the cylinder
    print("Enter the radius and length of a cylinder: ", end="")
    radius = float(input())
    # Calculate area
    area = calculate_area(radius)
    # Enter length
    length = float(input())
    # Print area of cylinder
    print("The area is", area)
    # Print volume of cylinder
    print("The volume of the cylinder is", calculate_volume(area, length))

def calculate_area(radius):
    return radius * radius * math.pi

def calculate_volume(area, length):
    return area * length

if __name__ == "__main__":
    main()

