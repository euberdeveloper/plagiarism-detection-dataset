# Import any needed libraries
import math

def main():
    print("Miles\t\tKilometers")
    print("-------------------------------")
    # Use for loop
    for i in range(1, 11):
        #Display the result
        #i = miles
        print(f"{i}\t\t{convert_miles_to_kilo(i):.3f}")

def convert_miles_to_kilo(miles):
    return miles * 1.609

if __name__ == "__main__":
    main()

