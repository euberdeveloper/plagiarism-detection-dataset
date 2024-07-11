import math

rad = float(input("Enter the radius and length of a cylinder: "))
l = float(input())
ar = rad * rad * math.pi
vol = ar * l
print(f"The area is {ar}")
print(f"The volume of the cylinder is {vol}")

