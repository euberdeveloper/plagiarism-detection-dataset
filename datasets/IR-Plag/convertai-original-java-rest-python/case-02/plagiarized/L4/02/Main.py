import math

def area(r):
    return r * r * math.pi

def volume(len, a):
    return len * a

if __name__ == "__main__":
    r = float(input("Enter the radius and length of a cylinder: "))
    len = float(input())

    a = area(r)
    volume = volume(len, a)

    print(f"The area is {a}")
    print(f"The volume of the cylinder is {volume}")

