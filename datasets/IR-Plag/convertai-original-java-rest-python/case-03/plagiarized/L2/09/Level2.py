import math

print("Enter weight in pounds: ", end="")
berat = float(input())
print("Enter feet: ", end="")
feet = float(input())
print("Enter inches: ", end="")
inches = float(input())
tinggi = feet * 12 + inches

bmi = berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254))

print(f"BMI is {bmi:.2f}")
if bmi < 18.5:
    print("Underweight")
elif bmi < 25:
    print("Normal")
elif bmi < 30:
    print("Overweight")
else:
    print("Obese")

