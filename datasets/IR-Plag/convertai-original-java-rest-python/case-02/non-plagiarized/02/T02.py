import math

r = float(input("Enter the radius and length of a cylinder: "))
l = float(input())

area = r * r * math.pi
volume = area * l

print(f"The area is {area:.5f}")
print(f"The volume is {volume:.5f}")

