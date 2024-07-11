def convert_miles_to_kilo(miles):
    return miles * 1.609

print("Miles\t\tKilometers")
print("-------------------------------")

counter = 1
while counter <= 10:
    print(f"{counter}\t\t{convert_miles_to_kilo(counter):.3f}")
    counter += 1

