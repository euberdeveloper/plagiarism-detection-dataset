import math

radius = float(input("Enter the radius and length of a cylinder: "))
length = float(input())
area = radius * radius * math.pi
volume = area * length
print("The area is", area)
print("The volume of the cylinder is", volume)

