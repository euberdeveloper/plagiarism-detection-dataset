import math

radius_length = input("Enter the radius and length of a cylinder: ")
radius, length = map(float, radius_length.split())

area = round(radius * radius * math.pi, 4)
volume = round(radius * radius * math.pi * length, 1)

print(f"The area is {area}")
print(f"The volume is {volume}")

