# Import any needed libraries
import sys

def tabelKonversi():
    mil = 1
    while mil <= 10:
        print(f"{mil}\t\t{mil * 1.609}")
        mil += 1

def main():
    print("Miles\t\tKilometers")
    print("-------------------------------")
    tabelKonversi()

if __name__ == "__main__":
    main()

