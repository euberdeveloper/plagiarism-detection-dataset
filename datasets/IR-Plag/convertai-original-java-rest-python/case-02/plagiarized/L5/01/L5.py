import math

def hit_luas(jari2):
    return jari2 * jari2 * math.pi

def total(luas, panjang):
    return luas * panjang

if __name__ == "__main__":
    jari2, panjang = map(float, input("Enter the radius and length of a cylinder: ").split())
    luas = hit_luas(jari2)
    total_volume = total(luas, panjang)
    print(f"The area is {luas} , The volume of the cylinder is {total_volume}")

