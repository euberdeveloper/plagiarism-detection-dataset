import math

rad = float(input("Enter the radius and length of a cylinder: "))
panjang = float(input())

a = rad * rad * math.pi
vol = a * panjang

print(f"The area is {a:.5f}")
print(f"The volume of the cylinder is {vol:.5f}")

