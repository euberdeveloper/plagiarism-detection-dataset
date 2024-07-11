import math

radius = float(input("Enter the radius and length of a cylinder: "))
length = int(input())

area = radius * radius * math.pi
print(f"The area is {area}")
print(f"The volume is {area * length}")

