import math

def show_table(num_data):
    print("Miles\t\tKilometers")
    print("-------------------------------")
    for i in range(num_data, 0, -1):
        temp = num_data + 1 - i
        print(f"{temp}\t\t{convert_miles_to_kilo(temp):.3f}")

def convert_miles_to_kilo(miles):
    return miles * 1.609

if __name__ == "__main__":
    show_table(10)

