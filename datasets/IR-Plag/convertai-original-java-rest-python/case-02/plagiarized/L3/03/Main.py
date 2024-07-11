import math

radius, length, areas, volumes = 0.0, 0.0, 0.0, 0.0

print("Enter the radius and length of a cylinder: ", end="")
radius, length = map(float, input().split())

areas = radius * radius * math.pi
volumes = areas * length

print(f"The area is {areas:.5f}")
print(f"The volume of the cylinder is {volumes:.5f}")

