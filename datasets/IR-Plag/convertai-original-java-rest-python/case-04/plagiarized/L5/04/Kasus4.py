import math

def Konversi(miles):
    return miles * 1.609

print("Miles\t\tKilometers")
print("-------------------------------")
for miles in range(1, 11):
    print(f"{miles}\t\t{Konversi(miles):.3f}")

