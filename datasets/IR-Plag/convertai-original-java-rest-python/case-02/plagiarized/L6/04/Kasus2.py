import math

# Enter radius and length of the cylinder
r, l = map(float, input("Enter the radius and length of a cylinder: ").split())

print(f"The area is {r**2 * math.pi}")
print(f"The volume of the cylinder is {r**2 * math.pi * l}")

