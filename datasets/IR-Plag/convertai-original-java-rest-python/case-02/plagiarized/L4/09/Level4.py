import math

def main():
    radius, height = map(float, input("Enter the radius and length of a cylinder: ").split())
    
    area = calculate_base_area(radius)
    volume = calculate_volume(area, height)
    
    print(f"The area is {area:.5f}")
    print(f"The volume of the cylinder is {volume:.5f}")

def calculate_base_area(rad):
    return rad ** 2 * math.pi

def calculate_volume(base_area, height):
    return base_area * height

if __name__ == "__main__":
    main()

