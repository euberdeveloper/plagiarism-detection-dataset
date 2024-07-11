import math

def area(r):
    return r * r * math.pi

def volume(len, a):
    return len * a

if __name__ == "__main__":
    r, len = map(float, input("Enter the radius and length of a cylinder: ").split())
    a = area(r)
    print("The area is", area(r))
    print("The volume of the cylinder is", volume(len, a))

