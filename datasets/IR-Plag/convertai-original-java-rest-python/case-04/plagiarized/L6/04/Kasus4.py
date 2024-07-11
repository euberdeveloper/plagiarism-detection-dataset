# Import any needed libraries
import sys

def konversi(miles):
    if miles <= 10:
        print(f"{miles}\t\t{miles * 1.609}")
        return konversi(miles + 1)
    return 0

def main():
    print("Miles\t\tKilometers")
    print("-------------------------------")
    konversi(1)

if __name__ == "__main__":
    main()

