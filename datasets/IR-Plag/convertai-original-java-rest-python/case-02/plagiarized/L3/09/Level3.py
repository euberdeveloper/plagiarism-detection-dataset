import math

radius = float(input("Enter the radius and length of a cylinder: "))
length = float(input())

luas_alas = radius ** 2 * math.pi
vol = luas_alas * length

print(f"The area is {luas_alas:.5f}")
print(f"The volume of the cylinder is {vol:.5f}")

