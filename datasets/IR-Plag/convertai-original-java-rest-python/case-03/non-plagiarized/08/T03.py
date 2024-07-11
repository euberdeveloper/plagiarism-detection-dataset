import math

weight = float(input("Enter weight in pounds: "))
feet = float(input("Enter feet: "))
inches = float(input("Enter Inches: "))

height = feet * 12 + inches
bmi = weight * 0.45359237 / math.pow((height * 0.0254), 2)

print("BMI is", bmi)

if bmi < 18.5:
    print("underweight")
elif bmi < 25:
    print("normal")
elif bmi < 35:
    print("overweight")
else:
    print("obese")

