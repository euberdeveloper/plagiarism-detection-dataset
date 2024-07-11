import math

# masukan silinder
radius = float(input("Enter the radius and length of a cylinder: "))
length = float(input())

# perhitungan
area = radius ** 2 * math.pi
volume = area * length

# cetak hasil
print(f"The area is {area:.5f}")
print(f"The volume of the cylinder is {volume:.5f}")
