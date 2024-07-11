import math

def hitung_tinggi(feet, inches):
    return feet * 12 + inches

def hitung_bmi(weight, height):
    return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

def cek_bmi(bmi):
    if bmi < 18.5:
        print("Underweight")
    elif bmi < 25:
        print("Normal")
    elif bmi < 30:
        print("Overweight")
    else:
        print("Obese")

if __name__ == "__main__":
    weight = float(input("Enter weight in pounds: "))
    feet = float(input("Enter feet: "))
    inches = float(input("Enter inches: "))
    bmi = hitung_bmi(weight, hitung_tinggi(feet, inches))
    print(f"BMI is {bmi:.2f}")
    cek_bmi(bmi)

