import math

radius = float(input("Enter the radius and length of a cylinder : "))
length = float(input())

area = radius * radius * math.pi
volume = area * length

print(f"The area is {area:.5f}")
print(f"The volume is {volume:.5f}")

