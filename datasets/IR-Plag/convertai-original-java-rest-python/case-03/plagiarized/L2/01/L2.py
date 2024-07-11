import math

weight_in_pounds = float(input("Enter weight in pounds: "))
feet = float(input("Enter feet: "))
inches = float(input("Enter inches: "))
height_in_meters = (feet * 12 + inches) * 0.0254

bmi = weight_in_pounds * 0.45359237 / (height_in_meters * height_in_meters)

print(f"BMI is {bmi:.2f}")
if bmi < 18.5:
    print("Underweight")
elif bmi < 25:
    print("Normal")
elif bmi < 30:
    print("Overweight")
else:
    print("Obese")

