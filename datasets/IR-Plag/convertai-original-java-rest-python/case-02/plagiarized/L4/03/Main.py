import math

radius, length, areas, volumes = 0.0, 0.0, 0.0, 0.0

def main():
    global radius, length, areas, volumes
    
    # Enter radius of the cylinder
    print("Enter the radius and length of a cylinder: ", end="")
    radius = float(input())
    length = float(input())
    areas = radius * radius * math.pi
    volumes = areas * length
    cetak()

def cetak():
    print(f"The area is {areas:.5f}")
    print(f"The volume of the cylinder is {volumes:.5f}")

if __name__ == "__main__":
    main()

