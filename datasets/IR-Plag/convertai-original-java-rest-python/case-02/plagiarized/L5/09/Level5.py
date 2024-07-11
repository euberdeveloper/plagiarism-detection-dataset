import math

radius = float(input("Enter the radius and length of a cylinder: "))
height = float(input())

area = radius * radius * math.pi
volume = radius * radius * math.pi * height

print(f"The area is {area}")
print(f"The volume of the cylinder is {volume}")

