import math

print("Enter weight in pounds: ", end="")
berat = float(input())

print("Enter feet: ", end="")
kaki = float(input())
print("Enter inches: ", end="")
inch = float(input())
tinggi = kaki * 12 + inch

rata = berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254))

print(f"BMI is {rata:.2f}")
if rata < 18.5:
    print("Underweight")
elif rata < 25:
    print("Normal")
elif rata < 30:
    print("Overweight")
else:
    print("Obese")

