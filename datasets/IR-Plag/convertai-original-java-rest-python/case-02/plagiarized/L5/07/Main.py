import math

def main():
    # Masukan radius silinder
    print("Enter the radius and length of a cylinder: ", end="")
    jejari, panjang = map(float, input().split())
    
    # Mencetak luas dan volume
    print("The area is", hitung_area(jejari))
    print("The volume of the cylinder is", hitung_volume(panjang, jejari))

def hitung_area(jejari):
    return jejari * jejari * math.pi

def hitung_volume(panjang, jejari):
    return hitung_area(jejari) * panjang

if __name__ == "__main__":
    main()

