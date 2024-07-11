# Import any needed libraries
import sys

def print_jarak_dalam_mil_dan_kilo(jarak):
    while jarak <= 10:
        # Print hasil di sini sebanyak 10 kali
        print(f"{jarak}\t\t{jarak * 1.609}")
        jarak += 1

def main():
    print("Miles\t\tKilometers")
    print("-------------------------------")
    # Di sini mengulang perhitungan jarak dalam mil dan kilometer
    jarak = 1
    print_jarak_dalam_mil_dan_kilo(jarak)

if __name__ == "__main__":
    main()

