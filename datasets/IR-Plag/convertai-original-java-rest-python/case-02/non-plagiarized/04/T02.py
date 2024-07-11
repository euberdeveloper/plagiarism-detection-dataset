import math
from decimal import Decimal, ROUND_HALF_UP

def main():
    radius = float(input("Enter the radius and length of a cylinder: "))
    length = float(input())
    area = radius * radius * math.pi
    volume = area * length
    
    print(f"The area is {Decimal(area).quantize(Decimal('.####'), rounding=ROUND_HALF_UP)}")
    print(f"The volume is {Decimal(volume).quantize(Decimal('.#'), rounding=ROUND_HALF_UP)}")

if __name__ == "__main__":
    main()

