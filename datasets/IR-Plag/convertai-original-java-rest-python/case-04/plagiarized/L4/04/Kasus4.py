def Konversi(miles):
    print(f"{miles}\t\t{miles * 1.609}")

print("Miles\t\tKilometers")
print("-------------------------------")
# Use for loop
for miles in range(1, 11):
    Konversi(miles)

