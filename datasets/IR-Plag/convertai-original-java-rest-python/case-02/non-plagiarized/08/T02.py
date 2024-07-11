import math

radius = float(input("Enter the radius and length of a cylinder: "))
length = float(input())

area = math.pow(radius, 2) * math.pi
volume = area * length

print(f"The area is {area}")
print(f"The volume is {volume}")

