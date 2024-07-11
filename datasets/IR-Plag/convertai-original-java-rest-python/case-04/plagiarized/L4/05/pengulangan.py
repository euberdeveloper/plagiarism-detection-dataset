import math

def hit_hasil(m):
    while m <= 10:
        print(f"{m}\t\t{m * 1.609}")
        m += 1

def main():
    m = 1
    print("Miles\t\tKilometers")
    print("-------------------------------")
    hit_hasil(m)

if __name__ == "__main__":
    main()

