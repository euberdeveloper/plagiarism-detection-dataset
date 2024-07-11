import math

# Enter radius of the cylinder
print("Enter the radius and length of a cylinder: ", end="")
radius, length = map(float, input().split())

# Calculate Area
area = radius * radius * math.pi

# Print area cylinder
print("The area is", area)

# Calculate Volume
volume = area * length

# Print volume cylinder
print("The volume of the cylinder is", volume)

