import math

r = float(input("Enter the radius and length of a cylinder: "))
len = float(input())

a = r * r * math.pi
volume = a * len

print(f"The area is {a:.5f}")
print(f"The volume of the cylinder is {volume:.5f}")

