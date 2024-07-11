import math

class inputoutput:
    rad = 0.0
    panjang = 0.0

    @staticmethod
    def input():
        inputoutput.rad = float(input("Enter the radius and length of a cylinder: "))
        inputoutput.panjang = float(input())

    @staticmethod
    def hitArea():
        return math.pow(inputoutput.rad, 2) * 3.14159

def main():
    # masukan silinder
    inputoutput.input()

    vol = 0.0
    a = inputoutput.hitArea()

    # perhitungan
    vol = a * inputoutput.panjang

    # cetak hasil
    print("The area is", a)
    print("The volume of the cylinder is", vol)

if __name__ == "__main__":
    main()

