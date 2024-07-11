import math

# Enter radius of the cylinder
radius, length = map(float, input("Enter the radius and length of a cylinder: ").split())

# Calculate area
area = radius * radius * math.pi

# Calculate volume
volume = area * length

# Print area cylinder
print("The area is", area)

# Print volume cylinder
print("The volume of the cylinder is", volume)

