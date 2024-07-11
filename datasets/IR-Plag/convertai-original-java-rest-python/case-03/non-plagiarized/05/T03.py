import math

weight_lbs = int(input("Enter weight in pounds: "))
feet = int(input("Enter feet: "))
inches = int(input("Enter inches: "))

weight_kg = weight_lbs * 0.45359237
height_m = (feet * 12 + inches) * 0.0254
bmi = weight_kg / (height_m ** 2)

print(f"BMI is {bmi:.2f}")

if bmi < 18.5:
    print("Underweight")
elif 18.5 <= bmi < 25:
    print("Normal")
elif 25 <= bmi < 35:
    print("Overweight")
elif bmi >= 35:
    print("Obese")

