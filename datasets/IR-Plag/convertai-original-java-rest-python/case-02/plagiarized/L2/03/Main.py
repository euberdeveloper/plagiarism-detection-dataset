import math

# Enter radius of the cylinder
radius, length = map(float, input("Enter the radius and length of a cylinder: ").split())

areas = radius * radius * math.pi
volumes = areas * length

print(f"The area is {areas:.5f}")
print(f"The volume of the cylinder is {volumes:.5f}")

