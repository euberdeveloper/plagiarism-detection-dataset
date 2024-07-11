import math
from decimal import Decimal, ROUND_HALF_UP

def main():
    radius, length = map(float, input("Enter the radius and length of a cylinder: ").split())
    
    area = radius ** 2 * math.pi
    volume = area * length
    
    print(f"The area is {area:.4f}")
    print(f"The volume is {volume:.1f}")

if __name__ == "__main__":
    main()

