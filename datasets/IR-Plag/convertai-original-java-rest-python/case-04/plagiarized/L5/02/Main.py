def print_mil(mil):
    for i in range(1, 11):
        print(f"{mil}\t\t{mil * 1.609}")
        mil += 1

if __name__ == "__main__":
    # Declare MIL
    mil = 1
    # Miles to kilometer
    print("Miles\t\tKilometers")
    print("-------------------------------")

    # Use function
    print_mil(mil)

