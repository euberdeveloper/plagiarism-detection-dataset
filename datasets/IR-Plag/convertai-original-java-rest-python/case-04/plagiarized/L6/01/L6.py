def print(mil):
    for i in range(10, 0, -1):
        print(f"{mil}\t\t{mil * 1.609}")
        mil += 1

if __name__ == "__main__":
    mil = 1
    print("Miles\t\tKilometers")
    print("-------------------------------")
    print(mil)

