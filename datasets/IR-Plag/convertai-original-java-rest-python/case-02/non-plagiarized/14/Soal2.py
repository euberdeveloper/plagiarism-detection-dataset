import math
from decimal import Decimal, ROUND_HALF_UP

def main():
    radius, length = map(float, input("Enter the radius and length of a cylinder: ").split())
    area = Decimal(radius ** 2 * math.pi).quantize(Decimal('.0001'), rounding=ROUND_HALF_UP)
    volume = Decimal(area * length).quantize(Decimal('.0'), rounding=ROUND_HALF_UP)
    print(f"The area is {area}")
    print(f"The volume is {volume}")

if __name__ == "__main__":
    main()

