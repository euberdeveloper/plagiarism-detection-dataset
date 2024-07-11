# Import necessary libraries
import math

# Define the main function
def main():
    mil = 0
    print("Miles\t\tKilometers")
    print("-------------------------------")
    
    mil = 1
    while mil <= 10:
        print(f"{mil}\t\t{mil * 1.609:.3f}")
        mil += 1

# Call the main function
if __name__ == "__main__":
    main()

