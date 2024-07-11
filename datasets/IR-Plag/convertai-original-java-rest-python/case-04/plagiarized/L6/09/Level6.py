def konversi(mile):
    if mile != 11:
        print(f"{mile}\t\t{mile * 1.609}")
        mile += 1
        konversi(mile)

print("Miles\t\tKilometers")
print("-------------------------------")
konversi(1)

