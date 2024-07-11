import math

arr = [[0 for _ in range(2)] for _ in range(11)]

for i in range(11):
    if i == 0:
        print("Miles\tKilometers")
    else:
        print(f"{i}\t{round(i * 1.609, 3)}")

