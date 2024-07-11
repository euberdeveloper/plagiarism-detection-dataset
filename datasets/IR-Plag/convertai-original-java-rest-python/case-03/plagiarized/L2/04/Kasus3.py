import math

def hitung_tinggi(feet, inches):
    return feet * 12 + inches

def hitung_bmi(weight, height):
    return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

if __name__ == "__main__":
    weight = float(input("Enter weight in pounds: "))
    feet = float(input("Enter feet: "))
    inches = float(input("Enter inches: "))
    height = hitung_tinggi(feet, inches)
    bmi = hitung_bmi(weight, height)
    print(f"BMI is {bmi:.2f}")
    if bmi < 18.5:
        print("Underweight")
    elif bmi < 25:
        print("Normal")
    elif bmi < 30:
        print("Overweight")
    else:
        print("Obese")

