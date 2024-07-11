def print_mil(mil):
    while mil <= 10:
        print(f"{mil}\t\t{mil * 1.609}")
        mil += 1

if __name__ == "__main__":
    # Declare MIL
    mil = 1
    # Miles to kilometer
    print("Miles\t\tKilometers")
    print("-------------------------------")
    
    # Use while loop
    print_mil(mil)

