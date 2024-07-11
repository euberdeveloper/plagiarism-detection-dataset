import math

# Enter radius of the cylinder
radius = float(input("Enter the radius and length of a cylinder: "))
length = float(input())

area = radius * radius * math.pi
volume = area * length

print(f"The area is {area:.5f}")
print(f"The volume of the cylinder is {volume:.5f}")
