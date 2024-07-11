import math

radius = float(input("Enter the radius of the cylinder: "))
length = int(input("Enter the length of the cylinder: "))

area = math.pi * radius**2
volume = area * length

print(f"The area of the cylinder is: {area:.2f}")
print(f"The volume of the cylinder is: {volume:.2f}")

