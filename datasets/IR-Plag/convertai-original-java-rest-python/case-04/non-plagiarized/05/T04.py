import math

print("Miles       Kilometers")

for i in range(1, 11):
    if i < 10:
        print(f"{i:d}           {i*1609:.0f}")
    else:
        print(f"{i:d}          {i*1609:.0f}")

