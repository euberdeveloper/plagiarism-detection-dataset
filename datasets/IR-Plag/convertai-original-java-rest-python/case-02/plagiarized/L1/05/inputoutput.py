import math

# Get user input
radius = float(input("Enter the radius of the cylinder: "))
length = float(input("Enter the length of the cylinder: "))

# Calculate area and volume
area = math.pi * radius ** 2
volume = area * length

# Print results
print(f"The area of the cylinder is {area:.2f}")
print(f"The volume of the cylinder is {volume:.2f}")

