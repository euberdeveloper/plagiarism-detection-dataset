import math

def fungsiBmi(berat, feet, inches):
    tinggi = feet * 12 + inches
    return berat * 0.45359237 / (tinggi * 0.0254) ** 2

def result(res):
    print(f"BMI is {res:.2f}")
    if res < 18.5:
        print("Underweight")
    elif 18.5 <= res < 25:
        print("Normal")
    elif 25 <= res < 30:
        print("Overweight")
    else:
        print("Obese")

if __name__ == "__main__":
    berat = float(input("Enter weight in pounds: "))
    feet = float(input("Enter feet: "))
    inches = float(input("Enter inches: "))
    result(fungsiBmi(berat, feet, inches))

