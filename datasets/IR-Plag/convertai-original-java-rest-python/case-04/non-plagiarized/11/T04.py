import decimal

print("Miles\tKilometers")
for i in range(1, 11):
    print(f"{i}\t{decimal.Decimal(i * 1.609).quantize(decimal.Decimal('0.000'))}")

