def konversi(n):
    miles = 1
    while miles <= n:
        print(f"{miles}\t\t{miles * 1.609}")
        miles += 1

print("Miles\t\tKilometers")
print("-------------------------------")
konversi(10)

