import math

berat = float(input("Enter weight in pounds: "))
feet = float(input("Enter feet: "))
inci = float(input("Enter inches: "))
tinggi = feet * 12 + inci
bmi = berat * 0.45359237 / ((tinggi * 0.0254) ** 2)

print(f"BMI is {bmi:.2f}")
if bmi < 18.5:
    print("Underweight")
elif bmi < 25:
    print("Normal")
elif bmi < 30:
    print("Overweight")
else:
    print("Obese")

