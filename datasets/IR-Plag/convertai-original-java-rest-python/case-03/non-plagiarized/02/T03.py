import math

# Get user input
weight_lbs = float(input("Enter weight in pounds: "))
feet = float(input("Enter feet: "))
inches = float(input("Enter inches: "))

# Calculate height in meters
height_m = (feet * 12 + inches) * 0.0254

# Calculate BMI
bmi = weight_lbs * 0.45359237 / (height_m ** 2)

# Print BMI and classification
print(f"BMI is {bmi:.2f}")
if bmi < 18.5:
    print("Underweight")
elif 18.5 <= bmi < 25:
    print("Normal")
elif 25 <= bmi < 35:
    print("Overweight")
else:
    print("Obese")

