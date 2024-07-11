import math

radius = float(input("Enter the radius and length of a cylinder : "))
length = float(input())
area = (radius ** 2) * math.pi
volume = area * length
print("The area is : " + str(area))
print("The volume is : " + str(volume))

