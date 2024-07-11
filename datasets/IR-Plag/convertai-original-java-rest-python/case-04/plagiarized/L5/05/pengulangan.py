import math

def hit_hasil(m):
    for a in range(m, 11):
        print(f"{a}\t\t{a * 1.609}")

def main():
    m = 1
    print("Miles\t\tKilometers")
    print("-------------------------------")
    hit_hasil(m)

if __name__ == "__main__":
    main()

