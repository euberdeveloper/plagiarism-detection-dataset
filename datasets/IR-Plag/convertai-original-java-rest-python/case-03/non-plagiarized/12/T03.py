import math

print("Enter weight in pounds : ", end="")
weight = float(input())

print("Enter feet : ", end="")
feet = float(input())

print("Enter inches : ", end="")
inches = float(input())

height = feet * 12 + inches
bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
print("BMI is", bmi)

if bmi < 18.5:
    print("Underweight")
elif bmi >= 18.5 and bmi < 25:
    print("Normal")
elif bmi >= 25 and bmi < 35:
    print("Overweight")
else:
    print("obese")

