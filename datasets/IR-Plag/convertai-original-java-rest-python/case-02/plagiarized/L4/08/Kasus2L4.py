import math

def main():
    # Enter radius of the cylinder
    print("Enter the radius and length of a cylinder: ", end="")
    radius, length = map(float, input().split())
    # Calculate Area
    area = calculate_area(radius)
    # Print area cylinder
    print("The area is", area)
    # Calculate Volume
    volume = calculate_volume(area, length)
    # Print volume cylinder
    print("The volume of the cylinder is", volume)

def calculate_area(radius):
    return radius * radius * math.pi

def calculate_volume(area, length):
    return area * length

if __name__ == "__main__":
    main()

