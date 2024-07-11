import math

def hitung_tinggi(feet, inches):
    return feet * 12 + inches

def hitung_bmi(weight, feet, inches):
    return weight * 0.45359237 / ((hitung_tinggi(feet, inches) * 0.0254) * (hitung_tinggi(feet, inches) * 0.0254))

def cek_bmi(bmi):
    if bmi < 18.5:
        return "Underweight"
    elif bmi < 25:
        return "Normal"
    elif bmi < 30:
        return "Overweight"
    else:
        return "Obese"

if __name__ == "__main__":
    weight = float(input("Enter weight in pounds: "))
    feet = float(input("Enter feet: "))
    inches = float(input("Enter inches: "))
    
    bmi = hitung_bmi(weight, feet, inches)
    print(f"BMI is {bmi:.2f}")
    print(cek_bmi(bmi))

