import math

# Enter radius of the cylinder
print("Enter the radius and length of a cylinder: ")
r = float(input())
len = float(input())

a = r * r * math.pi
volume = a * len

# Output
print("The area is", a)
print("The volume of the cylinder is", volume)

