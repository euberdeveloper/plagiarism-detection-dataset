import math

# Masukan radius silinder
radius = float(input("Enter the radius and length of a cylinder: "))
length = float(input())

# Mencetak luas dan volume
print("The area is", calculate_area(radius))
print("The volume of the cylinder is", calculate_volume(radius, length))

def calculate_area(radius):
    return radius * radius * math.pi

def calculate_volume(radius, length):
    return calculate_area(radius) * length

