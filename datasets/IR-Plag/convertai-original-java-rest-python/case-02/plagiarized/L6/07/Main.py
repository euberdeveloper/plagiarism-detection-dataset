import math

def main():
    # Get the radius and length of the cylinder from the user
    print("Enter the radius and length of a cylinder: ", end="")
    radius, length = map(float, input().split())
    
    # Calculate the area and volume of the cylinder
    area = calculate_area(radius)
    volume = calculate_volume(length, radius)
    
    # Print the results
    print("The area is", area)
    print("The volume of the cylinder is", volume)

def calculate_area(radius):
    return math.pow(radius, 2) * 3.14159

def calculate_volume(length, radius):
    return calculate_area(radius) * length

if __name__ == "__main__":
    main()

